package com.lkjbs.latestmovies

import android.app.Application
import com.lkjbs.latestmovies.core.di.ApplicationComponent
import com.lkjbs.latestmovies.core.di.ApplicationModule
import com.lkjbs.latestmovies.core.di.DaggerApplicationComponent
import com.squareup.leakcanary.LeakCanary

class MovieApplication : Application() {

    private val applicationComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        this.injectMembers()
        this.initializeLeakDetection()
    }

    private fun injectMembers() = applicationComponent.inject(this)

    private fun initializeLeakDetection() {
        if (BuildConfig.DEBUG) LeakCanary.install(this)
    }

}