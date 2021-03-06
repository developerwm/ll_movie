// Generated by data binding compiler. Do not edit!
package com.tauat1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.tauat1.R;
import com.tauat1.app.model.Movie;
import com.tauat1.ui.adapter.MoviesRecyclerAdapter;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class MovieListItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView movieImage;

  @NonNull
  public final TextView movieTitle;

  @Bindable
  protected Movie mMovie;

  @Bindable
  protected MoviesRecyclerAdapter.MovieViewHolder mViewHolder;

  protected MovieListItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, ImageView movieImage, TextView movieTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.movieImage = movieImage;
    this.movieTitle = movieTitle;
  }

  public abstract void setMovie(@Nullable Movie movie);

  @Nullable
  public Movie getMovie() {
    return mMovie;
  }

  public abstract void setViewHolder(@Nullable MoviesRecyclerAdapter.MovieViewHolder viewHolder);

  @Nullable
  public MoviesRecyclerAdapter.MovieViewHolder getViewHolder() {
    return mViewHolder;
  }

  @NonNull
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_list_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<MovieListItemBinding>inflateInternal(inflater, R.layout.movie_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.movie_list_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static MovieListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<MovieListItemBinding>inflateInternal(inflater, R.layout.movie_list_item, null, false, component);
  }

  public static MovieListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static MovieListItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (MovieListItemBinding)bind(component, view, R.layout.movie_list_item);
  }
}
