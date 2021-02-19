package com.meganster.timetracker.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
open class DataSourceModule {

    @Provides
    @Singleton
    internal fun gson(): Gson {
        return GsonBuilder()
            .setPrettyPrinting()
            .create()
    }

}