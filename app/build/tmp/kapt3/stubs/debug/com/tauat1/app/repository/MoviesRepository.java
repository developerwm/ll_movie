package com.tauat1.app.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/tauat1/app/repository/MoviesRepository;", "", "movieDao", "Lcom/tauat1/app/persistence/dao/MovieAndDetailDao;", "appExecutors", "Lcom/tauat1/app/repository/util/AppExecutors;", "movieApi", "Lcom/tauat1/app/api/MoviesApi;", "(Lcom/tauat1/app/persistence/dao/MovieAndDetailDao;Lcom/tauat1/app/repository/util/AppExecutors;Lcom/tauat1/app/api/MoviesApi;)V", "getListMovie", "Landroidx/lifecycle/LiveData;", "Lcom/tauat1/app/repository/util/Resource;", "", "Lcom/tauat1/app/model/Movie;", "pageNumber", "", "Companion", "app_debug"})
public final class MoviesRepository {
    private final com.tauat1.app.persistence.dao.MovieAndDetailDao movieDao = null;
    private final com.tauat1.app.repository.util.AppExecutors appExecutors = null;
    private final com.tauat1.app.api.MoviesApi movieApi = null;
    private static final java.lang.String TAG = "MoviesRepository";
    public static final com.tauat1.app.repository.MoviesRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> getListMovie(int pageNumber) {
        return null;
    }
    
    public MoviesRepository(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.persistence.dao.MovieAndDetailDao movieDao, @org.jetbrains.annotations.NotNull()
    com.tauat1.app.repository.util.AppExecutors appExecutors, @org.jetbrains.annotations.NotNull()
    com.tauat1.app.api.MoviesApi movieApi) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tauat1/app/repository/MoviesRepository$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}