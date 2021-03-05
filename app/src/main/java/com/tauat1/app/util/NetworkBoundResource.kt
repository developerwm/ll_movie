package com.tauat1.app.repository.util

import android.util.Log
import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.tauat1.app.api.response.ApiEmptyResponse
import com.tauat1.app.api.response.ApiErrorResponse
import com.tauat1.app.api.response.ApiResponse
import com.tauat1.app.api.response.ApiSuccessResponse

abstract class NetworkBoundResource<CacheObject, RequestObject>
@MainThread constructor(private val appExecutors: AppExecutors) {
    private val result = MediatorLiveData<Resource<CacheObject>>()

    init {
        result.value = Resource.Loading(null)
        @Suppress("LeakingThis")
        val dbSource = loadFromDb()
        result.addSource(dbSource) { data ->
            result.removeSource(dbSource)
            if (shouldFetch(data)) {
                fetchFromNetwork(dbSource)
            } else {
                result.addSource(dbSource) { currentCachedData ->
                    setValue(Resource.Success(currentCachedData))
                }
            }
        }
    }

    @MainThread
    private fun setValue(newValue: Resource<CacheObject>) {
        if (result.value != newValue) {
            result.value = newValue
        }
    }

    private fun fetchFromNetwork(dbSource: LiveData<CacheObject>) {
        val apiResponse = createCall()
        result.addSource(dbSource) { currentCachedData ->
            setValue(Resource.Loading(currentCachedData))
        }
        result.addSource(apiResponse) { response ->
            Log.e("errorresponse","=="+response.toString())
            result.removeSource(apiResponse)
            result.removeSource(dbSource)
            when (response) {
                is ApiSuccessResponse -> {
                    appExecutors.diskIO.execute {
                        saveCallResult(processResponse(response))
                        appExecutors.mainThreadExecutor.execute {
                            result.addSource(loadFromDb()) { newCachedObject ->
                                setValue(Resource.Success(newCachedObject))
                            }
                        }
                    }
                }
                is ApiEmptyResponse -> {
                    appExecutors.mainThreadExecutor.execute {
                        result.addSource(loadFromDb()) { oldCachedObject ->
                            setValue(Resource.Success(oldCachedObject))
                        }
                    }
                }
                is ApiErrorResponse -> {
                    result.addSource(dbSource) { oldCachedObject ->
                        setValue(Resource.Error(response.errorMessage, oldCachedObject))
                    }
                }
            }
        }
    }

    fun asLiveData() = result as LiveData<Resource<CacheObject>>

    @WorkerThread
    protected open fun processResponse(response: ApiSuccessResponse<RequestObject>) = response.body

    @WorkerThread
    protected abstract fun saveCallResult(item: RequestObject?)

    @MainThread
    protected abstract fun shouldFetch(data: CacheObject?): Boolean

    @MainThread
    protected abstract fun loadFromDb(): LiveData<CacheObject>

    @MainThread
    protected abstract fun createCall(): LiveData<ApiResponse<RequestObject>>
}