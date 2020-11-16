package com.dengdai.calendarviewcollapse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.joda.time.LocalDate
import com.wefika.calendar.manager.CalendarManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendar.init(CalendarManager(LocalDate.now(),CalendarManager.State.MONTH, LocalDate.now(), LocalDate.now().plusYears(1)))
    }
}