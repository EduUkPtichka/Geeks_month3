package com.example.lessondz3v5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction=supportFragmentManager.beginTransaction()
        val mainFragment = FragmentOne()
        transaction.add(R.id.conteyner, mainFragment).commit()
    }
}