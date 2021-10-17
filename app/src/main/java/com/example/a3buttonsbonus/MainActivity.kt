package com.example.a3buttonsbonus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edToast: EditText
    lateinit var edUpdateTV: EditText
    lateinit var edNewActivity: EditText
    lateinit var btToast: Button
    lateinit var btUpdateTV: Button
    lateinit var btNewActivity: Button
    lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edToast = findViewById(R.id.edToast)
        edUpdateTV = findViewById(R.id.edUpdateTV)
        edNewActivity = findViewById(R.id.edNewActivity)
        btToast = findViewById(R.id.btToast)
        btUpdateTV = findViewById(R.id.btUpdateTV)
        btNewActivity = findViewById(R.id.btNewActivity)
        tv = findViewById(R.id.tv)

        btToast.setOnClickListener {
            Toast.makeText(this, edToast.text.toString(), Toast.LENGTH_SHORT).show()
            edToast.setText("")
        }
        btUpdateTV.setOnClickListener {
            tv.text = edUpdateTV.text
            edUpdateTV.setText("")
        }
        btNewActivity.setOnClickListener {

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("TextView", edNewActivity.text.toString())
            startActivity(intent)
            edNewActivity.setText("")
        }
    }
}