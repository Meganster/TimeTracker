package com.meganster.timetracker.activity

import com.meganster.timetracker.base.BaseViewModel
import com.meganster.timetracker.repository.timetable.TimetableRepository

class MainActivityViewModel internal constructor(
    private val timetableRepository: TimetableRepository
) : BaseViewModel() {

    override fun back() {
        // todo
    }

}