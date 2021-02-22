package com.meganster.timetracker.di

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.meganster.timetracker.base.BaseFragment
import com.meganster.timetracker.base.BaseViewModel
import javax.inject.Inject

abstract class FragmentWithViewModel<
        ViewModelType : BaseViewModel,
        ViewModelFactory : ViewModelProvider.Factory> : BaseFragment() {

    @Inject
    internal open lateinit var modelFactory: ViewModelFactory

    protected lateinit var viewModel: ViewModelType

    protected abstract val classType: Class<ViewModelType>

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel = ViewModelProvider(getMainActivity(), modelFactory).get(classType)
    }

}