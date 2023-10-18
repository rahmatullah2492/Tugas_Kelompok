package com.example.aplikasikelompok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.aplikasikelompok.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}