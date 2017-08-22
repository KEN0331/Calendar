package com.example.ken.calendar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.co.recruit_mp.android.lightcalendarview.LightCalendarView

/**
 * main activity for calendar.
 */
class MainActivity : AppCompatActivity() {

    val calendarView: LightCalendarView by lazy { findViewById(R.id.calendar_view) as LightCalendarView }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
