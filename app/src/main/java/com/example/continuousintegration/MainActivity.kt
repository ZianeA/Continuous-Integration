package com.example.continuousintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This change is not allowed to be pushed directly to the remote master branch.
        // I have to create a pull request first.
    }
}