package com.example.counterapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count =0
        plus.setOnClickListener{
            count++
            counter.text = "$count"
        }
        minus.setOnClickListener{
            count--
            counter.text = "$count"
        }
        reset.setOnClickListener{
            count = 0
            counter.text = "$count"
        }
        exit.setOnClickListener{
            finish()
        }
    }
}