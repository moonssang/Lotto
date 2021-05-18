package com.smuexample.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.ConStellationCard).setOnClickListener{
            startActivity(Intent(this,ConstellationActivity::class.java))

            findViewById<View>(R.id.NameCard).setOnClickListener {
                startActivity(Intent(this,NameActivity::class.java))
            }

        }
    }
}