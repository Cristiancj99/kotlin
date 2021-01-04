package com.example.daggerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component by lazy {
            (application as MyApplication).appComponent().inject(MainModule(this))

        }
        component.inject(this)
    }
}