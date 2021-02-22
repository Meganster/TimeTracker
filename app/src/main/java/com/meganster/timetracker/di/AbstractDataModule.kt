package com.meganster.timetracker.di

import com.meganster.timetracker.repository.timetable.TimetableRepository
import com.meganster.timetracker.repository.timetable.TimetableRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class AbstractDataModule {

    @Binds
    @Singleton
    internal abstract fun provideTimetableRepository(timetableRepository: TimetableRepositoryImpl): TimetableRepository

}