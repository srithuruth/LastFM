package com.example.lastfm.di

import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton

interface AppComponent{
    fun FMService(): FMService
}