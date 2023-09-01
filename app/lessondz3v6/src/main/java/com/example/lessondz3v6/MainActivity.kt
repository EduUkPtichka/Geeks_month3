package com.example.lessondz3v6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lessondz3v6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.container, SongFragment()).commit()
    }
}
