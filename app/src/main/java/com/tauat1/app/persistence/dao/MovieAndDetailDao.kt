package com.tauat1.app.persistence.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.tauat1.app.model.Movie

@Dao
interface MovieAndDetailDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertMovies(vararg movie: Movie):LongArray

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movie: Movie)

    @Update
    fun updateMovie(movie:Movie)

    @Query("SELECT * FROM movie LIMIT (:pageNumber*20)")
    fun getMovies(pageNumber: Int):LiveData<List<Movie>>

    @Query("SELECT * FROM movie WHERE title LIKE '%' || :query || '%'  LIMIT (:pageNumber*20) ")
    fun searchListMovie(query: String, pageNumber:Int):LiveData<List<Movie>>



}
