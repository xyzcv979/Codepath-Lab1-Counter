package com.example.codepathlab1clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        var increment = 1
        val add1Button = findViewById<ImageButton>(R.id.imageButton)
        val textView = findViewById<TextView>(R.id.textView)
        val upgradeButton = findViewById<Button>(R.id.upgradeButton)

        add1Button.setOnClickListener() {
            //Toast.makeText(it.context, "Clicked Button!", Toast.LENGTH_SHORT).show()
            counter += increment
            textView.text = counter.toString()

            if(counter >= 10 && increment == 1) {
                upgradeButton.visibility = View.VISIBLE
                upgradeButton.setOnClickListener() {
                    upgradeButton.visibility = View.INVISIBLE
                    increment = 2
                }
            }
        }

    }
}