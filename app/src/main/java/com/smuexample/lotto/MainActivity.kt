package com.smuexample.lotto

import ResultActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber (): Int{
    return Random().nextInt(45)+1
}

fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while(true) {
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0
        // for(j in 0..lottoNumbers.size){
        if (lottoNumbers.contains(number)) {
            // if(number.equals(lottoNumbers[j])) {
            flag_existing = 1
            // continue
        }
        //  if(flag_existing.equals(1))
        //      continue
        //  else
        lottoNumbers.add(number)
        if (lottoNumbers.size >= 6)
            break;
        }
    return lottoNumbers
    }

fun  getShuffledLottoNumbers () : MutableList<Int>{
    val list = mutableListOf<Int>()
    for(number in 1..45){
        list.add(number)
    }
    list.shuffle()

    return list.subList(0,6)
}



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.RandomCard).setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
            intent.putIntegerArrayListExtra("result", ArrayList(getShuffledLottoNumbers()))
        }

         findViewById<View>(R.id.ConStellationCard).setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

         findViewById<View>(R.id.NameCard).setOnClickListener {
                startActivity(Intent(this,NameActivity::class.java))
        }


    }
}