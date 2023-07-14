package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnlogin = findViewById<Button>(R.id.btnlogin)
        val tcreate = findViewById<TextView>(R.id.tcreate)
        val btnlewati = findViewById<Button>(R.id.btnlewati)
        btnlogin.setOnClickListener{
            startActivity(Intent(this, home::class.java))
        }
        tcreate.setOnClickListener {
            startActivity(Intent(this, signup::class.java))
        }
        btnlewati.setOnClickListener {
            startActivity(Intent(this, home::class.java))
        }
    }

} 