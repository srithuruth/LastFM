package com.example.lastfm.ui

import com.example.lastfm.model.Response


interface HomeContract{
    interface View{
        fun showResults(results: List<Response>)
        fun showError(message: String)
    }

    interface Presenter{
        fun getFMDetails(album: String, artist: String)
    }
}