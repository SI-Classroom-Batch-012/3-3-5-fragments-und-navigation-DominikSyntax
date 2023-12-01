package com.example.freitag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freitag.data.Gift

class MainActivity : AppCompatActivity() {

    var gifts: Gift? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}