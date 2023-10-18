package com.example.aplikasikelompok

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasikelompok.databinding.ActivityLoginBinding

class MainActivity_login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

    }
}