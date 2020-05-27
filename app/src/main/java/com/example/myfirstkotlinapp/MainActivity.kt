package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onSubmit(view: View) {
        val inputYear = age;
        val currentYear = Calendar.getInstance().get(Calendar.YEAR);
        result.text=((currentYear - inputYear.text.toString().toInt()).toString())
    }
}

