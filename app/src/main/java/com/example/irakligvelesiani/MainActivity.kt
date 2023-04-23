package com.example.irakligvelesiani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var number: EditText
    lateinit var message: EditText
    lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number = findViewById(R.id.number)
        message = findViewById(R.id.message)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {

            val bundle = Bundle()
            bundle.putString("id", number.text.toString())
            bundle.putString("message", message.text.toString())

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}