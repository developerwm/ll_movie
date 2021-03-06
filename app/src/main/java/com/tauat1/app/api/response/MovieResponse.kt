package com.tauat1.app.api.response

import com.google.gson.annotations.SerializedName
import com.tauat1.app.model.Movie

class MoviesResponse{

    @SerializedName("page")
    var page:Int=1

    @SerializedName("total_results")
    val totalResults:Int=0

    @SerializedName("total_pages")
    val total_pages:Int=0

    @SerializedName("results")
    val movies:List<Movie>?=null
}
