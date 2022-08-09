package com.example.pc2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            //サブアクティビティへ遷移するためのintentを設定
            val intent: Intent = Intent(this, MainActivity2::class.java)
            //サブアクティビティへ渡す値を設定
            intent.putExtra("extra", "MainActivityから遷移")
            //サブアクティビティへ遷移する
            startActivity(intent)
        }
    }
}