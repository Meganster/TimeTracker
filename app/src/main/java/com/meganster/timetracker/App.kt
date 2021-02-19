package com.meganster.timetracker

import android.app.Application
import com.meganster.timetracker.di.DaggerAppComponent
import com.meganster.timetracker.di.DataSourceModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

open class App : Application(), HasAndroidInjector {

    @Inject
    internal  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .dataSourceModule(getDataSourcesModule())
            .create(this)
            .inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }

    private fun getDataSourcesModule(): DataSourceModule {
        return DataSourceModule()
    }

}