package com.tauat1.app.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/tauat1/app/api/MoviesApi;", "", "getPopularMovies", "Landroidx/lifecycle/LiveData;", "Lcom/tauat1/app/api/response/ApiResponse;", "Lcom/tauat1/app/api/response/MoviesResponse;", "page", "", "apiKey", "", "app_debug"})
public abstract interface MoviesApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract androidx.lifecycle.LiveData<com.tauat1.app.api.response.ApiResponse<com.tauat1.app.api.response.MoviesResponse>> getPopularMovies(@retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}