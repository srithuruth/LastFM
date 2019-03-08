package com.example.lastfm

import android.app.AppComponentFactory
import android.app.Application

class App: Application(){

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()

    }

    fun getComponent() = appComponent

}