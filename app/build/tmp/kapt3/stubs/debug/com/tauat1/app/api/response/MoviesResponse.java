package com.tauat1.app.api.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/tauat1/app/api/response/MoviesResponse;", "", "()V", "movies", "", "Lcom/tauat1/app/model/Movie;", "getMovies", "()Ljava/util/List;", "page", "", "getPage", "()I", "setPage", "(I)V", "totalResults", "getTotalResults", "total_pages", "getTotal_pages", "app_debug"})
public final class MoviesResponse {
    @com.google.gson.annotations.SerializedName(value = "page")
    private int page;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private final int totalResults = 0;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private final int total_pages = 0;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "results")
    private final java.util.List<com.tauat1.app.model.Movie> movies = null;
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tauat1.app.model.Movie> getMovies() {
        return null;
    }
    
    public MoviesResponse() {
        super();
    }
}