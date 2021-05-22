package com.unlam.edu.ar.videotecamoviltp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {

    lateinit var btnHome : ImageButton
    lateinit var btnSearch : ImageButton
    lateinit var btnSelectFavourite : ImageButton
    lateinit var btnUser : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        getViews()
        setListenerNavigationBar()
    }

    private fun getViews() {
        btnHome = findViewById(R.id.btnHome)
        btnSearch = findViewById(R.id.btnSearch)
        btnSelectFavourite = findViewById(R.id.btnSelectFavourite)
        btnUser = findViewById(R.id.btnUser)
    }

    private fun setListenerNavigationBar() {
        btnHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        btnSelectFavourite.setOnClickListener {
            val intent = Intent(this, FavActivity::class.java)
            startActivity(intent)
        }

        btnUser.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
    }
}