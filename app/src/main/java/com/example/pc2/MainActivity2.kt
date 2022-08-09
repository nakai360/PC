package com.example.pc2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            //サブアクティビティへ遷移するためのintentを設定
            val intent: Intent = Intent(this, PCparts::class.java)
            //サブアクティビティへ渡す値を設定
            intent.putExtra("extra", "MainActivityから遷移")
            //サブアクティビティへ遷移する
            startActivity(intent)

        }
    }
}