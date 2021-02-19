package com.meganster.timetracker.di

import com.meganster.timetracker.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector
    internal abstract fun mainFragmentInjector(): MainFragment

}