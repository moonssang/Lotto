package com.smuexample.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConstellationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)

        val btnGoConstell = findViewById<Button>(R.id.btnGoConstell)
        btnGoConstell.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }

    }
}