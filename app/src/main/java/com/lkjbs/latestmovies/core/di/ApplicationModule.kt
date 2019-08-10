package com.lkjbs.latestmovies.core.di

import android.content.Context
import com.lkjbs.latestmovies.MovieApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val movieApplication: MovieApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = movieApplication

}