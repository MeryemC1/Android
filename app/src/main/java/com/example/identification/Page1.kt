package com.example.identification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.Page1.*

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.Page_1)


        ButtonId.setOnClickListener() {
            val otherActivity = Intent(this, Activite2::class.java)
            startActivity(otherActivity)
            finish();
        }
    }
}