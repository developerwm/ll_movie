package com.tauat1.app.api

import androidx.lifecycle.LiveData
import com.tauat1.app.api.response.ApiResponse
import com.tauat1.app.api.response.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("page") page: Int = 1,
        @Query("api_key") apiKey: String = "c5850ed73901b8d268d0898a8a9d8bff"
    ): LiveData<ApiResponse<MoviesResponse>>
}
