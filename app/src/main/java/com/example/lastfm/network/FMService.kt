package com.example.lastfm.network

import com.example.lastfm.model.Data
import com.example.lastfm.model.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.*

interface FMService{

    @GET(END_POINT)

    fun getFMDetails(@Query("album")album: String,
                     @Query("artist")artist: String) : Observable<List<Response>>

    )
}