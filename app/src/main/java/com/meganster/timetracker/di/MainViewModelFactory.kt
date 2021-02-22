package com.meganster.timetracker.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.meganster.timetracker.activity.MainActivityViewModel
import com.meganster.timetracker.main.MainViewModel
import com.meganster.timetracker.repository.timetable.TimetableRepository
import javax.inject.Inject

class MainViewModelFactory @Inject internal constructor(
    private val timetableRepository: TimetableRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainActivityViewModel::class.java) -> MainActivityViewModel(
                timetableRepository
            ) as T
            modelClass.isAssignableFrom(MainViewModel::class.java) -> MainViewModel() as T
            else -> throw Throwable("No such ViewModel")
        }
    }

}