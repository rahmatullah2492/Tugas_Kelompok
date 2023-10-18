package com.example.aplikasikelompok

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.aplikasikelompok.databinding.ActivitySplashScrennMainBinding

class SplashScrenn_MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScrennMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashScrennMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity_login::class.java))
            finish()
        }, 3000)
    }
}