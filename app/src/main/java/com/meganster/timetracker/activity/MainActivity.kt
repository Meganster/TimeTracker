package com.meganster.timetracker.activity

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.meganster.timetracker.R
import com.meganster.timetracker.di.MainViewModelFactory
import com.meganster.timetracker.main.MainFragment
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory

    private lateinit var mViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewModel = ViewModelProvider(this, mainViewModelFactory).get(MainActivityViewModel::class.java)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, MainFragment.newInstance())
            .commitNow()
    }

    override fun onBackPressed() {
        finish()
    }

}