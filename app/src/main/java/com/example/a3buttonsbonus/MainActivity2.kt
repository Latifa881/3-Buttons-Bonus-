package com.example.a3buttonsbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var btBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tv=findViewById(R.id.tv)
        btBack=findViewById(R.id.btBack)
        val intent=getIntent()
       val text= intent.getStringExtra("TextView")
        tv.setText(text)
        btBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}