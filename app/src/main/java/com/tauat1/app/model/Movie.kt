package com.tauat1.app.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "movie",indices = [Index("id")], primaryKeys = ["id"])
data class Movie(
    @SerializedName("id")
    val id: Long = 0,

    @SerializedName("title")
    val title: String? = null,

    @ColumnInfo(name = "poster_path")
    @SerializedName("poster_path")
    val posterPath: String? = null,

    @ColumnInfo(name = "backdrop_path")
    @SerializedName("backdrop_path")
    val backdropPath: String? = null,

    @ColumnInfo(name = "vote_average")
    @SerializedName("vote_average")
    val voteAverage: Double? = 0.0,

    @ColumnInfo(name = "vote_count")
    @SerializedName("vote_count")
    var voteCount: Int = 0,

    @SerializedName("original_language")
    val language: String? = null,

    @ColumnInfo(name = "release_date")
    @SerializedName("release_date")
    val releaseDate: String? = null,

    @SerializedName("overview")
    val overview: String? = null,

    @SerializedName("popularity")
    val popularity:Double = 0.0

):Parcelable{
}