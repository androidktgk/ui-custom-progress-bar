package com.example.uidesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val progressBar=findViewById<ProgressBar>(R.id.progressBar)
        var per=0
        findViewById<Button>(R.id.btnStartProgress).setOnClickListener{
            per = per + 5
            progressBar.progress = per
        }
    }
}