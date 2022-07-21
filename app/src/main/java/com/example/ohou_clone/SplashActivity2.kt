package com.example.ohou_clone

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity2: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.background_splash_2)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
