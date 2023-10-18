package com.example.aplikasikelompok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasikelompok.databinding.ActivityRegisterBinding

class activity_register : AppCompatActivity() {

    private  lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_register)

        supportActionBar?.hide()
    }
}