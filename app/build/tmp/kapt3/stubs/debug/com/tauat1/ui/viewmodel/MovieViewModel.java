package com.tauat1.ui.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 -2\u00020\u0001:\u0001-B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010\'\u001a\u00020&J\u0006\u0010(\u001a\u00020&J \u0010)\u001a\u00020&2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u001aJ\u0006\u0010+\u001a\u00020&J\"\u0010,\u001a\u00020&2\u0018\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u001aH\u0002R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/tauat1/ui/viewmodel/MovieViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "repository", "Lcom/tauat1/app/repository/MoviesRepository;", "app", "Landroid/app/Application;", "(Lcom/tauat1/app/repository/MoviesRepository;Landroid/app/Application;)V", "_movies", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/tauat1/app/repository/util/Resource;", "", "Lcom/tauat1/app/model/Movie;", "_pageNumber", "Landroidx/lifecycle/MutableLiveData;", "", "getApp", "()Landroid/app/Application;", "cancelRequest", "", "getCancelRequest", "()Z", "setCancelRequest", "(Z)V", "isPerformingQuery", "isQueryExhausted", "movies", "Landroidx/lifecycle/LiveData;", "getMovies", "()Landroidx/lifecycle/LiveData;", "pageNumber", "getPageNumber", "query", "", "getQuery", "()Ljava/lang/String;", "setQuery", "(Ljava/lang/String;)V", "executeRequest", "", "getList", "getNextPage", "registerMediatorLiveData", "repositorySource", "resetPageNumber", "unregisterMediatorLiveData", "Companion", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.AndroidViewModel {
    private boolean isQueryExhausted;
    private boolean isPerformingQuery;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String query;
    private boolean cancelRequest;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> _pageNumber = null;
    private final androidx.lifecycle.MediatorLiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> _movies = null;
    private final com.tauat1.app.repository.MoviesRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application app = null;
    private static final java.lang.String TAG = "MovieViewModel";
    public static final com.tauat1.ui.viewmodel.MovieViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuery() {
        return null;
    }
    
    public final void setQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getCancelRequest() {
        return false;
    }
    
    public final void setCancelRequest(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Integer> getPageNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> getMovies() {
        return null;
    }
    
    public final void getList() {
    }
    
    public final void getNextPage() {
    }
    
    private final void executeRequest() {
    }
    
    public final void registerMediatorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> repositorySource) {
    }
    
    private final void unregisterMediatorLiveData(androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> repositorySource) {
    }
    
    public final void resetPageNumber() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApp() {
        return null;
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.repository.MoviesRepository repository, @org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tauat1/ui/viewmodel/MovieViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}