package com.example.lastfm.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import com.example.lastfm.App
import com.example.lastfm.R
import com.example.lastfm.model.Response
import com.example.lastfm.ui.di.HomeModule
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), HomeContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerHomeComponent.builder()
            .appComponent((application as App).getComponent())
            .homeModule(HomeModule(this))
            .build()
            .inject(this)

        rvSearch.layoutManager = LinearLayout(this)
        rvSearch.adapter = FMAdapter

        btnSearch.setOnClickListener{
            homePresenter.getFMDetails()
        }

    }

    override fun showResults(results: List<Response>) {
        FMAdapter.setData(results)
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
