package com.smuexample.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntArrayExtra("result") ?: return

        val result_sorted = result?.sorted()

       // result?.Let{
        //  updateLottoBallImages(result.sortedBy { it })
       // }
        updateLottoBallImages(result_sorted)


    }

    private fun updateLottoBallImages(result_sorted : List<Int>) {
        val lottoBallImagesStartId = R.drawable.ball_01 //146
        //val lottoBallImagestId2 = R.drawable.ball_02
        //val lottoBallImagestId3 = R.drawable.ball_03

        val imageview3 = findViewById<ImageView>(R.id.imageView3)
        val imageview4 = findViewById<ImageView>(R.id.imageView4)
        val imageview5 = findViewById<ImageView>(R.id.imageView5)
        val imageview6 = findViewById<ImageView>(R.id.imageView6)
        val imageview7 = findViewById<ImageView>(R.id.imageView7)
        val imageview8 = findViewById<ImageView>(R.id.imageView8)

        imageview3.setImageResource(lottoBallImagesStartId + result_sorted[0] -1)
        imageview4.setImageResource(lottoBallImagesStartId + result_sorted[1] -1)
        imageview5.setImageResource(lottoBallImagesStartId + result_sorted[2] -1)
        imageview6.setImageResource(lottoBallImagesStartId + result_sorted[3] -1)
        imageview7.setImageResource(lottoBallImagesStartId + result_sorted[4] -1)
        imageview8.setImageResource(lottoBallImagesStartId + result_sorted[5] -1)

    }
}