package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val menu1 = findViewById<Button>(R.id.btnmenu1)
        val menu2 = findViewById<Button>(R.id.btnmenu2)
        val menu3 = findViewById<Button>(R.id.btnmenu3)
        val profil = findViewById<ImageButton>(R.id.imgprofil)

        menu1.setOnClickListener{
            startActivity(Intent(this, clothes::class.java))
        }
        menu2.setOnClickListener{
            startActivity(Intent(this, shoes::class.java))
        }
        menu3.setOnClickListener{
            startActivity(Intent(this, jewelry::class.java))
        }
        profil.setOnClickListener{
            // startActivity(Intent(this, clothes::class.java))
        }
    }
}