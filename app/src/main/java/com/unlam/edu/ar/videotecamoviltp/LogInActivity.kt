package com.unlam.edu.ar.videotecamoviltp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class LogInActivity : AppCompatActivity() {

    lateinit var logButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        logButton = findViewById(R.id.logInButton)

        logButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }
    }

}