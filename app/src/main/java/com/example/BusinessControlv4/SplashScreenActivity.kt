package com.example.BusinessControlv4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        GlobalScope.launch {
           val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            delay(8000)
            finish()
        }
    }
}