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



    //활성화된 액티비티가 다른화면에 가려지거나, 홈버튼눌러서 액티비티가 비활성화될때 항상 호출된다.
    override fun onPause() {
        super.onPause()

//        Log.d("다른화면", "onPause가 실행됨")

    }


    //액티비티가 종료될때, 한번 호출된다.
    override fun onDestroy() {
        super.onDestroy()
        Log.d("다른화면", "onDestroy 실행됨")

    }



}
