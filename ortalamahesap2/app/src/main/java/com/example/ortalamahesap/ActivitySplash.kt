package com.example.ortalamahesap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class ActivitySplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var asagidanGelenbutton=AnimationUtils.loadAnimation(this,R.anim.asagidangelenbutton)
        var yukaridanGelenbutton=AnimationUtils.loadAnimation(this,R.anim.yukaridangelenbalon)
        var asagidangeriDonenButton=AnimationUtils.loadAnimation(this,R.anim.asagigidenbutton)
        var yukariyaGidenBalon=AnimationUtils.loadAnimation(this,R.anim.yukariyagidenballon)
        btnOrHesapla.animation=asagidanGelenbutton
        imageView.animation=yukaridanGelenbutton
        btnOrHesapla.setOnClickListener{
            btnOrHesapla.startAnimation(asagidangeriDonenButton)
            imageView.startAnimation(yukariyaGidenBalon)
            object : CountDownTimer(1000,1000){
                override fun onFinish() {
                    var intent=Intent(applicationContext,MainActivity::class.java)
                    startActivity(intent)
                }

                override fun onTick(millisUntilFinished: Long) {

                }

            }.start()


        }
    }
}