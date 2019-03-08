package com.example.lastfm.ui.di

import com.example.lastfm.di.AppComponent
import com.example.lastfm.ui.MainActivity
import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
@HomeScope
interface HomeComponent{
    fun inject (mainActivity: MainActivity)
}