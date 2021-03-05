package com.tauat1.app.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tauat1.app.model.Movie
import com.tauat1.app.persistence.dao.MovieAndDetailDao

@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = true
)
@TypeConverters()
abstract class MovieDB : RoomDatabase() {
    abstract val movieDao: MovieAndDetailDao


}