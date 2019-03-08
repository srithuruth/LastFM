package com.example.lastfm.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import com.example.lastfm.R
import com.example.lastfm.model.Data

class FMAdapter : RecyclerView.Adapter<FMViewHolder>() {


    private val data = arrayListOf<Data>()


    fun setData(items: List<Data>) {
        data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FMViewHolder {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_data, parent, false)
        return FMViewHolder(rootView)
    }
}



override fun getItemCount(): Int {
    return data.size
}


override fun onBindViewHolder(viewHolder: FMViewHolder, position: Int) {
   viewHolder.bind(data[position])
}

class FMViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    fun bind(data: Data){
        val tvAlbum = view.findViewById<TextView>(R.id.tvAlbum)
        tvAlbum.text = data.album
        val tvArtist = view.findViewById<TextView>(R.id.tvArtist)
        tvArtist.text=data.artist
    }
}