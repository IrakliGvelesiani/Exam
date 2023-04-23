package com.example.irakligvelesiani

import android.widget.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var number : TextView
    lateinit var message : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        number = findViewById(R.id.number)
        message = findViewById(R.id.message)


        val bundle = intent.extras
        if (bundle != null){
            number.text = "number = ${bundle.getString("number")}"
            message.text = "message = ${bundle.getString("name")}"

        }
    }
}