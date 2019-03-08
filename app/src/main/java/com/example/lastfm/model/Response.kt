package com.example.lastfm.model

data class Response(
    val album: String,
    val artist: String,
    val response: List<Response>
)