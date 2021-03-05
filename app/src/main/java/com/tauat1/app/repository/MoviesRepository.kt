package com.tauat1.app.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.tauat1.app.api.MoviesApi
import com.tauat1.app.api.response.ApiResponse
import com.tauat1.app.api.response.MoviesResponse
import com.tauat1.app.model.Movie
import com.tauat1.app.persistence.dao.MovieAndDetailDao
import com.tauat1.app.repository.util.AppExecutors
import com.tauat1.app.repository.util.NetworkBoundResource
import com.tauat1.app.repository.util.Resource

class MoviesRepository(
    private val movieDao: MovieAndDetailDao,
    private val appExecutors: AppExecutors,
    private val movieApi: MoviesApi
) {
    companion object {
        private const val TAG = "MoviesRepository"
    }

    fun getListMovie(pageNumber: Int): LiveData<Resource<List<Movie>>> {
        return object : NetworkBoundResource<List<Movie>, MoviesResponse>(appExecutors) {
            override fun saveCallResult(item: MoviesResponse?) {
                item?.let {
                    val list: ArrayList<Movie>? = (item.movies)?.let { ArrayList(it) }
                    val newList: ArrayList<Movie>? = ArrayList<Movie>()
                    list?.forEach {
                       val movie = it.copy()
                        newList?.add(movie)
                    }
                    newList?.let {
                        movieDao.insertMovies(*newList.toTypedArray())
                    }
                }
            }

            override fun shouldFetch(data: List<Movie>?): Boolean {
                return true
            }

            override fun loadFromDb(): LiveData<List<Movie>> = movieDao.getMovies(pageNumber)

            override fun createCall(): LiveData<ApiResponse<MoviesResponse>> = movieApi.getPopularMovies(pageNumber)

        }.asLiveData()
    }
}
