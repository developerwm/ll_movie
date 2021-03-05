package com.tauat1.ui.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.tauat1.app.model.Movie
import com.tauat1.app.persistence.PreferencesStorage
import com.tauat1.app.repository.MoviesRepository
import com.tauat1.app.repository.util.Resource

class MovieViewModel(private val repository: MoviesRepository, val app: Application) :
    AndroidViewModel(app) {
    companion object {
        private const val TAG = "MovieViewModel"
    }

    private var isQueryExhausted: Boolean =
        false

    private var isPerformingQuery: Boolean = false
    var query: String? = PreferencesStorage.getStoredQuery(app.applicationContext)
    var cancelRequest = false

    private val _pageNumber = MutableLiveData<Int>()
    val pageNumber: LiveData<Int>
        get() = _pageNumber


    private val _movies = MediatorLiveData<Resource<List<Movie>>>()
    val movies: LiveData<Resource<List<Movie>>>
        get() = _movies

    init {
        _pageNumber.value = 1
    }

    fun getList() {
        if (!isPerformingQuery) {
            isQueryExhausted = false
            isPerformingQuery = true
            executeRequest()
        }
    }

    fun getNextPage() {
        Log.d(TAG, "getNextPage: ")
        if (!isQueryExhausted && !isPerformingQuery) {
            _pageNumber.value = _pageNumber.value?.plus(1)
            executeRequest()
        }
    }

    private fun executeRequest() {
        val repositorySource: LiveData<Resource<List<Movie>>>
        repositorySource = repository.getListMovie(pageNumber.value!!)
        registerMediatorLiveData(repositorySource)
    }


    fun registerMediatorLiveData(repositorySource: LiveData<Resource<List<Movie>>>) {
        _movies.addSource(repositorySource) { resourceListMovie ->
            if (!cancelRequest) {
                if (resourceListMovie != null) {
                    _movies.value = resourceListMovie
                    if (resourceListMovie is Resource.Success || resourceListMovie is Resource.Error) {
                        unregisterMediatorLiveData(repositorySource)
                        resourceListMovie.data?.let {
                            if (it.size < _pageNumber.value!! * 10) {
                                isQueryExhausted = true
                            }
                        }
                    }
                } else {
                    unregisterMediatorLiveData(repositorySource)
                }
            } else {
                unregisterMediatorLiveData(repositorySource)
            }

        }
    }

    private fun unregisterMediatorLiveData(repositorySource: LiveData<Resource<List<Movie>>>) {
        isPerformingQuery = false
        _movies.removeSource(repositorySource)
    }

    fun resetPageNumber() {
        _pageNumber.value = 1
    }

}