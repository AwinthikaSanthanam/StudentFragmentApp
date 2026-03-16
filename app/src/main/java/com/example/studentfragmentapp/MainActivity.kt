package com.example.studentfragmentapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var btnDetails: Button
    lateinit var btnMarks: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDetails = findViewById(R.id.btnDetails)
        btnMarks = findViewById(R.id.btnMarks)

        btnDetails.setOnClickListener {
            loadFragment(BasicDetailsFragment())
        }

        btnMarks.setOnClickListener {
            loadFragment(MarksFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }
}