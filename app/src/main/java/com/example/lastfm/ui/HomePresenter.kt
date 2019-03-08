package com.example.lastfm.ui

import com.example.lastfm.network.FMService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HomePresenter (
    private val fmService: FMService,
    private val view: HomeContract.View) : HomeContract.Presenter
    {

        private val compositeDisposable = CompositeDisposable()

        override fun getFMDetails(album: String, artist: String) {
            compositeDisposable.add(FMService.getFMDetails()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({view.showResults(it)}, {throwable -> view.showError(throwable.message!!)}))

        }

    }
