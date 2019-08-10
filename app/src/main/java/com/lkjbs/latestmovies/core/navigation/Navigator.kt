package com.lkjbs.latestmovies.core.navigation

import android.content.Context
import com.lkjbs.latestmovies.MoviesActivity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Navigator
@Inject constructor() {

    fun showMain(context: Context) {
        showMovies(context)
    }

    private fun showMovies(context: Context) = context.startActivity(MoviesActivity.callingIntent(context))

}