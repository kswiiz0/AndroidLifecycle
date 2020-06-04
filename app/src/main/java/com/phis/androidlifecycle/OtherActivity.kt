package com.phis.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        Log.d("다른화면", "onCreate가 실행됨")

        btnBack.setOnClickListener {
            finish()
        }
    }
}
