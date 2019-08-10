package com.lkjbs.latestmovies.core.di

import com.lkjbs.latestmovies.MovieApplication
import com.lkjbs.latestmovies.core.di.viewmodel.ViewModelModule
import com.lkjbs.latestmovies.core.navigation.RouteActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    ViewModelModule::class
])
interface ApplicationComponent {

    fun inject(application: MovieApplication)
    fun inject(routeActivity: RouteActivity)

}