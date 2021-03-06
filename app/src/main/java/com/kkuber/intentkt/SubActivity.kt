package com.kkuber.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if (intent.hasExtra("msg")) { // msg라는 객체를 가지고 있으면 실행
            tv_getMsg.text = intent.getStringExtra("msg") // 서브 액티비티에 존재하는 텍스트 뷰 에다가 hello world가 넘겨져옴
        }
    }
}