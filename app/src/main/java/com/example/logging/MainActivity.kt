package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    private lateinit var myedittext : EditText
    private lateinit var buttonlog : Button
    private lateinit var buttonTimber : Button
    //КОНСТАНТА
    private val myTag : String = "From EditText"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        Timber.plant(Timber.DebugTree())
        
        setContentView(R.layout.activity_main)

        myedittext = findViewById(R.id.editText)
        buttonlog = findViewById(R.id.button_log)
        buttonTimber = findViewById(R.id.button_timber)

        buttonlog.setOnClickListener { sendlog() }
        buttonTimber.setOnClickListener { sendtimber() }
    }
    private fun sendlog() {
        Log.v(myTag, myedittext.text.toString())
    }
    private fun sendtimber(){
        Timber.d(myedittext.text.toString())
    }
}