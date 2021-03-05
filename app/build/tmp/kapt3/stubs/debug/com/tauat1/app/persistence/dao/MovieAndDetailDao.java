package com.tauat1.app.persistence.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'J!\u0010\u000b\u001a\u00020\f2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\r\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u000eJ$\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/tauat1/app/persistence/dao/MovieAndDetailDao;", "", "getMovies", "Landroidx/lifecycle/LiveData;", "", "Lcom/tauat1/app/model/Movie;", "pageNumber", "", "insertMovie", "", "movie", "insertMovies", "", "", "([Lcom/tauat1/app/model/Movie;)[J", "searchListMovie", "query", "", "updateMovie", "app_debug"})
public abstract interface MovieAndDetailDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long[] insertMovies(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.model.Movie... movie);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertMovie(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.model.Movie movie);
    
    @androidx.room.Update()
    public abstract void updateMovie(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.model.Movie movie);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie LIMIT (:pageNumber*20)")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.tauat1.app.model.Movie>> getMovies(int pageNumber);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM movie WHERE title LIKE \'%\' || :query || \'%\'  LIMIT (:pageNumber*20) ")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.tauat1.app.model.Movie>> searchListMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query, int pageNumber);
}