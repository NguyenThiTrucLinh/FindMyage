package com.example.findmyage

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import java.util.*
import java.util.Calendar.getInstance
import java.util.Currency.getInstance

private var Nothing?.text: String
    get() {
        return (text)
    }
    set(text) {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    buGetAge.setOnClickListener{
        buUserAgeClick()
    }


    }
    fun buUserAgeClick(){
        //Add code run when button click
        val etDOB = null
        val userDOB = Integer.parseInt(etDOB.text.toString())
        val currentYear = getInstance().get(Calendar.YEAR)
        val userAgeInYears = currentYear - userDOB
        val tvShowAge = null
        tvShowAge.text = "Your Age is $userAgeInYears Years"
        Log.d("LogsMe", "Your Age is $userAgeInYears Years")
    }


}

object buGetAge {
    fun setOnClickListener(function: () -> Unit) {

    }

}
