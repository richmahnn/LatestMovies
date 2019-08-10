package com.lkjbs.latestmovies

import android.os.Bundle
import com.lkjbs.latestmovies.core.platform.BaseActivity
import com.lkjbs.latestmovies.core.platform.BaseFragment

class MoviesActivity : BaseActivity() {

    override fun fragment(): BaseFragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
    }
}
