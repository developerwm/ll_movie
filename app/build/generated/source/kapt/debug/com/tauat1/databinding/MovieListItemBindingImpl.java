package com.tauat1.databinding;
import com.tauat1.R;
import com.tauat1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MovieListItemBindingImpl extends MovieListItemBinding implements com.tauat1.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.card_view, 3);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MovieListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MovieListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.movieImage.setTag(null);
        this.movieTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.tauat1.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.movie == variableId) {
            setMovie((com.tauat1.app.model.Movie) variable);
        }
        else if (BR.viewHolder == variableId) {
            setViewHolder((com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.tauat1.app.model.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setViewHolder(@Nullable com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder ViewHolder) {
        this.mViewHolder = ViewHolder;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewHolder);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.tauat1.app.model.Movie movie = mMovie;
        java.lang.String moviePosterPath = null;
        com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder viewHolder = mViewHolder;
        java.lang.String MovieTitle1 = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movie != null) {
                    // read movie.posterPath
                    moviePosterPath = movie.getPosterPath();
                    // read movie.title
                    MovieTitle1 = movie.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.tauat1.ui.adapter.ListAdaptersKt.loadFrontMovieImage(this.movieImage, moviePosterPath);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieTitle, MovieTitle1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // movie
        com.tauat1.app.model.Movie movie = mMovie;
        // viewHolder != null
        boolean viewHolderJavaLangObjectNull = false;
        // viewHolder
        com.tauat1.ui.adapter.MoviesRecyclerAdapter.MovieViewHolder viewHolder = mViewHolder;
        // viewHolder.onMovieClickListener.invoke(movie)
        kotlin.Unit viewHolderOnMovieClickListenerInvokeMovie = null;
        // viewHolder.onMovieClickListener != null
        boolean viewHolderOnMovieClickListenerJavaLangObjectNull = false;
        // viewHolder.onMovieClickListener
        kotlin.jvm.functions.Function1<com.tauat1.app.model.Movie,kotlin.Unit> viewHolderOnMovieClickListener = null;



        viewHolderJavaLangObjectNull = (viewHolder) != (null);
        if (viewHolderJavaLangObjectNull) {


            viewHolderOnMovieClickListener = viewHolder.getOnMovieClickListener();

            viewHolderOnMovieClickListenerJavaLangObjectNull = (viewHolderOnMovieClickListener) != (null);
            if (viewHolderOnMovieClickListenerJavaLangObjectNull) {



                viewHolderOnMovieClickListenerInvokeMovie = viewHolderOnMovieClickListener.invoke(movie);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): viewHolder
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}