package com.kkuber.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener {
            // Intent(context, 이동할 activity)
            val intent = Intent(this, SubActivity::class.java) // 다음화면으로 이동하기 위해 Intent 객체 생성

            // hello World 라는 텍스트 값을 담은 뒤 msg라는 키로 잠금
            intent.putExtra("msg", tv_sendMsg.text.toString()) // putExtra(key, value)
            startActivity(intent) // intent에 저장되어 있는 액티비티 쪽으로 이동
            finish() // 자기 자신 액티비티는 사라짐.
        }
    }
}