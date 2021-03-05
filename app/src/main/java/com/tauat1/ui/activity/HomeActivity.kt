package com.tauat1.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.tauat1.R
import com.tauat1.app.model.Movie
import com.tauat1.ui.fragment.ListFragment

class MainActivity :AppCompatActivity(),
    ListFragment.Callbacks {
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpToolbar()

        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.main_container,
                    ListFragment()
                )
                .commit()
        }
    }
    private fun setUpToolbar(){
        toolbar = findViewById(R.id.main_toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onMovieClick(movie: Movie) {
    }

}