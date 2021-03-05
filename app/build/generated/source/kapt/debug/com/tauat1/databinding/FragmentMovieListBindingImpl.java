package com.tauat1.databinding;
import com.tauat1.R;
import com.tauat1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMovieListBindingImpl extends FragmentMovieListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading_view, 2);
        sViewsWithIds.put(R.id.pagination_loading_view, 3);
        sViewsWithIds.put(R.id.empty_data_screen, 4);
        sViewsWithIds.put(R.id.error_screen, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMovieListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentMovieListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.view.View) bindings[4]
            , (android.view.View) bindings[5]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recyclerview.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.tauat1.ui.viewmodel.MovieViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.tauat1.ui.viewmodel.MovieViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMovies((androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>>) object, fieldId);
            case 1 :
                return onChangeViewModelPageNumber((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMovies(androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> ViewModelMovies, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPageNumber(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelPageNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.util.List<com.tauat1.app.model.Movie> viewModelMoviesData = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelPageNumberGetValue = 0;
        androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>>> viewModelMovies = null;
        com.tauat1.app.repository.util.Resource<java.util.List<com.tauat1.app.model.Movie>> viewModelMoviesGetValue = null;
        java.lang.Integer viewModelPageNumberGetValue = null;
        com.tauat1.ui.viewmodel.MovieViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelPageNumber = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (viewModel != null) {
                    // read viewModel.movies
                    viewModelMovies = viewModel.getMovies();
                    // read viewModel.pageNumber
                    viewModelPageNumber = viewModel.getPageNumber();
                }
                updateLiveDataRegistration(0, viewModelMovies);
                updateLiveDataRegistration(1, viewModelPageNumber);


                if (viewModelMovies != null) {
                    // read viewModel.movies.getValue()
                    viewModelMoviesGetValue = viewModelMovies.getValue();
                }
                if (viewModelPageNumber != null) {
                    // read viewModel.pageNumber.getValue()
                    viewModelPageNumberGetValue = viewModelPageNumber.getValue();
                }

            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModelMoviesGetValue != null) {
                        // read viewModel.movies.getValue().data
                        viewModelMoviesData = viewModelMoviesGetValue.getData();
                    }
            }

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.pageNumber.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelPageNumberGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelPageNumberGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.tauat1.ui.adapter.ListAdaptersKt.emptyDataVisibility(this.emptyDataScreen, viewModelMoviesGetValue);
            com.tauat1.ui.adapter.ListAdaptersKt.networkErrorVisibility(this.errorScreen, viewModelMoviesGetValue);
            com.tauat1.ui.adapter.ListAdaptersKt.submitMovieList(this.recyclerview, viewModelMoviesData);
            com.tauat1.ui.adapter.ListAdaptersKt.checkVisibility(this.recyclerview, viewModelMoviesGetValue);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            com.tauat1.ui.adapter.ListAdaptersKt.firstPageLoadingVisibility(this.loadingView, viewModelMoviesGetValue, androidxDatabindingViewDataBindingSafeUnboxViewModelPageNumberGetValue);
            com.tauat1.ui.adapter.ListAdaptersKt.paginationLoadingVisibility(this.paginationLoadingView, viewModelMoviesGetValue, androidxDatabindingViewDataBindingSafeUnboxViewModelPageNumberGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.movies
        flag 1 (0x2L): viewModel.pageNumber
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}