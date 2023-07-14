package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

    val btnsignup = findViewById<Button>(R.id.btnsignup)


    btnsignup.setOnClickListener{
        startActivity(Intent(this, login::class.java))
        Toast.makeText(this ,"Create Account Succcess \n Silakan Login", Toast.LENGTH_LONG).show()
    }
    }
}