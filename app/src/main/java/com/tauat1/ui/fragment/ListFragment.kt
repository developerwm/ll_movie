package com.tauat1.ui.fragment

import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.integration.recyclerview.RecyclerViewPreloader
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.util.ViewPreloadSizeProvider
import com.tauat1.R
import com.tauat1.app.model.Movie
import com.tauat1.app.repository.util.RecyclerViewDecoration
import com.tauat1.databinding.FragmentMovieListBinding
import com.tauat1.ui.adapter.MoviesRecyclerAdapter
import com.tauat1.ui.viewmodel.MovieViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListFragment : Fragment() {
    private val movieViewModel by viewModel<MovieViewModel>()
    private lateinit var adapter: MoviesRecyclerAdapter
    private lateinit var binding: FragmentMovieListBinding

    private var callbacks: Callbacks? = null

    interface Callbacks {
        fun onMovieClick(movie: Movie)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        callbacks = context as Callbacks
    }

    override fun onDetach() {
        super.onDetach()
        callbacks = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMovieListBinding.inflate(inflater, container, false)
        binding.viewModel  = movieViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        initRecyclerView()
        setHasOptionsMenu(true)
        return binding.root
    }

    private fun initRecyclerView() {
        val viewPreloader = ViewPreloadSizeProvider<String>()
        binding.recyclerview.apply {
            this@ListFragment.adapter =
                MoviesRecyclerAdapter(
                    onMovieClickListener,viewPreloader,initGlide()
                )
            addItemDecoration(RecyclerViewDecoration())
            adapter = this@ListFragment.adapter
        }
        val preloader = RecyclerViewPreloader<String>(Glide.with(this), adapter, viewPreloader,20)
        binding.recyclerview.addOnScrollListener(scrollListener)
        binding.recyclerview.addOnScrollListener(preloader)
    }

    private val scrollListener: RecyclerView.OnScrollListener =
        object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1)) {
                    movieViewModel.getNextPage()
                }
            }
        }

    private fun initGlide(): RequestManager? {
        val options: RequestOptions = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
        return Glide.with(this).setDefaultRequestOptions(options)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getMovieList()
    }

    fun getMovieList() {
        movieViewModel.resetPageNumber()
        movieViewModel.getList()
    }

    private val onMovieClickListener: (movie: Movie) -> Unit = { movie->
        callbacks?.onMovieClick(movie)
    }
}


