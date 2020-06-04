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

    //화면이 활성화 될때 항상 호출된다.
    override fun onResume() {
        //자동새로고침과 같은 기능을 구현 할때 사용된다.
        super.onResume()



        Log.d("메인화면", "onResume가 실행됨")



    }


    //활성화된 액티비티가 다른화면에 가려지거나, 홈버튼눌러서 액티비티가 비활성화될때 항상 호출된다.
    override fun onPause() {
        //일시정지 기능으로 주로 활용된다.
        super.onPause()


        Log.d("메인화면", "onPause가 실행됨")

    }


}
