package com.meganster.timetracker.main

import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.meganster.timetracker.R
import com.meganster.timetracker.di.FragmentWithViewModel
import com.meganster.timetracker.di.MainViewModelFactory

class MainFragment : FragmentWithViewModel<MainViewModel, MainViewModelFactory>() {

    override val layout = R.layout.fragment_main
    override val classType = MainViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Toast.makeText(context, "started", Toast.LENGTH_SHORT).show()
    }

    companion object {
        fun newInstance() = MainFragment()
    }

}