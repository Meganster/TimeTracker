package com.meganster.timetracker.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseViewModel protected constructor() : ViewModel() {

    private val compositeDisposable by lazy { CompositeDisposable() }

    protected val loggingTag: String by lazy { this::class.java.simpleName.take(23) }


    abstract fun back()

    override fun onCleared() {
        compositeDisposable.clear()
    }

    protected fun Disposable.autoDispose(): Disposable {
        compositeDisposable.add(this)
        return this
    }

}