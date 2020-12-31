package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreet.R.layout.activity_birthday_greeting
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import kotlinx.android.synthetic.main.activity_main.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_birthday_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        BirthdayGreetings.text = "Happy Birthday\n$name!"

    }
}