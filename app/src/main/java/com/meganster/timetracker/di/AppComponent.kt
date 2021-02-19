package com.meganster.timetracker.di

import com.meganster.timetracker.App
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DataSourceModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>() {

        abstract fun dataSourceModule(dataSourceModule: DataSourceModule): Builder

        abstract override fun build(): AppComponent

    }

}