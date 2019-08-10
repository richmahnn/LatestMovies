package com.lkjbs.latestmovies.core.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lkjbs.latestmovies.MovieApplication
import com.lkjbs.latestmovies.core.di.ApplicationComponent
import javax.inject.Inject

class RouteActivity : AppCompatActivity() {

    private val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (application as MovieApplication).applicationComponent
    }

    @Inject internal lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        navigator.showMain(this)
    }

}