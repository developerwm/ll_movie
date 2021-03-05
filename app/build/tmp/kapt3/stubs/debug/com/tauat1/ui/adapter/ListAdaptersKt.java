package com.tauat1.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0007\u001a0\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a&\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0007\u001a0\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\"\u0010\r\u001a\u00020\u0001*\u00020\u000e2\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005H\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u000e2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u00a8\u0006\u0015"}, d2 = {"emptyDataVisibility", "", "view", "Landroid/view/View;", "repoResult", "Lcom/tauat1/app/repository/util/Resource;", "", "Lcom/tauat1/app/model/Movie;", "firstPageLoadingVisibility", "pageNumber", "", "networkErrorVisibility", "paginationLoadingVisibility", "checkVisibility", "Landroidx/recyclerview/widget/RecyclerView;", "loadFrontMovieImage", "Landroid/widget/ImageView;", "imageUrl", "", "submitMovieList", "movies", "app_debug"})
public final class ListAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"paginationRepoResult", "pageNumber"})
    public static final void paginationLoadingVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>> repoResult, int pageNumber) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"firstPageRepoResult", "pageNumber"})
    public static final void firstPageLoadingVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>> repoResult, int pageNumber) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"movieList"})
    public static final void submitMovieList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$submitMovieList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.tauat1.app.model.Movie> movies) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"rvVisibility"})
    public static final void checkVisibility(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$checkVisibility, @org.jetbrains.annotations.Nullable()
    com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>> repoResult) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"emptyDataVisibility"})
    public static final void emptyDataVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>> repoResult) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"networkErrorVisibility"})
    public static final void networkErrorVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>> repoResult) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"movieFrontImage"})
    public static final void loadFrontMovieImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadFrontMovieImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
}