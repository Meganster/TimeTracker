package com.meganster.timetracker.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.meganster.timetracker.activity.MainActivity
import dagger.android.support.DaggerFragment
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseFragment : DaggerFragment() {

    private val compositeDisposable by lazy { CompositeDisposable() }

    @get:LayoutRes
    protected abstract val layout: Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(layout, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        if (!compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }

    protected fun Disposable.disposeOnDestroyView(): Disposable {
        compositeDisposable.add(this)
        return this
    }

    protected fun getMainActivity() = activity as MainActivity

}