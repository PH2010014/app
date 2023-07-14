package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class front : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_front)

        val btnstart = findViewById<Button>(R.id.btnstart)

        btnstart.setOnClickListener{
            startActivity(Intent(this, login::class.java))
        }
    }

}