package com.example.ken.calendar

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.NonNull
import jp.co.recruit_mp.android.lightcalendarview.LightCalendarView
import jp.co.recruit_mp.android.lightcalendarview.MonthView
import org.joda.time.LocalDate
import java.util.*

class CalendarActivity : AppCompatActivity() {

    val calendarView by lazy { findViewById(R.id.calendar_view) as LightCalendarView }

    companion object {
        private val START_MONTH_FROM_CURRENT = 6
        private val END_MONTH_FROM_CURRENT = 5

        @JvmStatic
        fun createIntent(@NonNull context: Context) = Intent(context, CalendarActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        setRangeOfCalendar()
    }

    // set range based on current date
    private fun setRangeOfCalendar() {
        calendarView.apply {
            monthCurrent = Calendar.getInstance().time
            val currentDate = LocalDate(monthCurrent)
            val startMonth = currentDate.minusMonths(START_MONTH_FROM_CURRENT).monthOfYear
            val endMonth = currentDate.plusMonths(END_MONTH_FROM_CURRENT).monthOfYear
            monthFrom = Calendar.getInstance().apply { set(Calendar.MONTH, startMonth) }.time
            monthTo = Calendar.getInstance().apply { set(Calendar.MONTH, endMonth) }.time
        }
    }

    private fun setOnSelectListener() {
        calendarView.apply {
            setOnStateUpdatedListener(object : LightCalendarView.OnStateUpdatedListener {
                override fun onMonthSelected(date: Date, view: MonthView) {
                }

                override fun onDateSelected(date: Date) {
                }
            })
        }
    }
}
