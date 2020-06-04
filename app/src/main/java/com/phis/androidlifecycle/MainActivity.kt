package com.phis.androidlifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "onCreate가 실행됨")

        btnGoToOther.setOnClickListener {
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume가 실행됨")



    }

}
