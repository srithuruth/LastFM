package com.example.lastfm.ui.di

import com.example.lastfm.network.FMService
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val view: HomeContract.View){

    @HomeScope
    @Provides
    fun provideHomePresenter(Service: FMService): HomeContract.Presenter{
        return HomePresenter(Service, view)
    }
}