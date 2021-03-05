package com.tauat1.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u001f B1\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/tauat1/ui/adapter/MoviesRecyclerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/tauat1/app/model/Movie;", "Lcom/tauat1/ui/adapter/MoviesRecyclerAdapter$MovieViewHolder;", "Lcom/bumptech/glide/ListPreloader$PreloadModelProvider;", "", "onMovieClickListener", "Lkotlin/Function1;", "", "preloadSizeProvider", "Lcom/bumptech/glide/util/ViewPreloadSizeProvider;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "(Lkotlin/jvm/functions/Function1;Lcom/bumptech/glide/util/ViewPreloadSizeProvider;Lcom/bumptech/glide/RequestManager;)V", "getPreloadSizeProvider", "()Lcom/bumptech/glide/util/ViewPreloadSizeProvider;", "getRequestManager", "()Lcom/bumptech/glide/RequestManager;", "getPreloadItems", "", "position", "", "getPreloadRequestBuilder", "Lcom/bumptech/glide/RequestBuilder;", "item", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieDiffUtil", "MovieViewHolder", "app_debug"})
public final class MoviesRecyclerAdapter extends androidx.recyclerview.widget.ListAdapter<com.tauat1.app.model.Movie, com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder> implements com.bumptech.glide.ListPreloader.PreloadModelProvider<java.lang.String> {
    private final kotlin.jvm.functions.Function1<com.tauat1.app.model.Movie, kotlin.Unit> onMovieClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> preloadSizeProvider = null;
    @org.jetbrains.annotations.Nullable()
    private final com.bumptech.glide.RequestManager requestManager = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.String> getPreloadItems(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.bumptech.glide.RequestBuilder<?> getPreloadRequestBuilder(@org.jetbrains.annotations.NotNull()
    java.lang.String item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> getPreloadSizeProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bumptech.glide.RequestManager getRequestManager() {
        return null;
    }
    
    public MoviesRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.tauat1.app.model.Movie, kotlin.Unit> onMovieClickListener, @org.jetbrains.annotations.NotNull()
    com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> preloadSizeProvider, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.RequestManager requestManager) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/tauat1/ui/adapter/MoviesRecyclerAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/tauat1/databinding/MovieListItemBinding;", "onMovieClickListener", "Lkotlin/Function1;", "Lcom/tauat1/app/model/Movie;", "", "preloadSizeProvider", "Lcom/bumptech/glide/util/ViewPreloadSizeProvider;", "", "(Lcom/tauat1/databinding/MovieListItemBinding;Lkotlin/jvm/functions/Function1;Lcom/bumptech/glide/util/ViewPreloadSizeProvider;)V", "getOnMovieClickListener", "()Lkotlin/jvm/functions/Function1;", "getPreloadSizeProvider", "()Lcom/bumptech/glide/util/ViewPreloadSizeProvider;", "bind", "movie", "Companion", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.tauat1.databinding.MovieListItemBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.tauat1.app.model.Movie, kotlin.Unit> onMovieClickListener = null;
        @org.jetbrains.annotations.NotNull()
        private final com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> preloadSizeProvider = null;
        private static final java.lang.String TAG = "MovieViewHolder";
        public static final com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tauat1.app.model.Movie movie) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<com.tauat1.app.model.Movie, kotlin.Unit> getOnMovieClickListener() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> getPreloadSizeProvider() {
            return null;
        }
        
        private MovieViewHolder(com.tauat1.databinding.MovieListItemBinding binding, kotlin.jvm.functions.Function1<? super com.tauat1.app.model.Movie, kotlin.Unit> onMovieClickListener, com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> preloadSizeProvider) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/tauat1/ui/adapter/MoviesRecyclerAdapter$MovieViewHolder$Companion;", "", "()V", "TAG", "", "getInstance", "Lcom/tauat1/ui/adapter/MoviesRecyclerAdapter$MovieViewHolder;", "parent", "Landroid/view/ViewGroup;", "onMovieClickListener", "Lkotlin/Function1;", "Lcom/tauat1/app/model/Movie;", "", "preloadSizeProvider", "Lcom/bumptech/glide/util/ViewPreloadSizeProvider;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder getInstance(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super com.tauat1.app.model.Movie, kotlin.Unit> onMovieClickListener, @org.jetbrains.annotations.NotNull()
            com.bumptech.glide.util.ViewPreloadSizeProvider<java.lang.String> preloadSizeProvider) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/tauat1/ui/adapter/MoviesRecyclerAdapter$MovieDiffUtil;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/tauat1/app/model/Movie;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class MovieDiffUtil extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.tauat1.app.model.Movie> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.tauat1.app.model.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.tauat1.app.model.Movie newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.tauat1.app.model.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.tauat1.app.model.Movie newItem) {
            return false;
        }
        
        public MovieDiffUtil() {
            super();
        }
    }
}