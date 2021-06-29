package com.unlam.edu.ar.videotecamoviltp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageButton
import com.unlam.edu.ar.videotecamoviltp.databinding.ActivityFavBinding

class FavActivity : AppCompatActivity() {
    private lateinit var btnHome: ImageButton
    private lateinit var btnSearch: ImageButton
    private lateinit var btnUser: ImageButton
    private lateinit var binding: ActivityFavBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        getViews()
        setListeners()
    }

    private fun getViews() {
        btnHome = binding.btnHome
        btnSearch = binding.btnSearch
        btnUser = binding.btnUser
    }

    private fun setListeners() {
        btnHome.setOnClickListener{
            navigateToHome()
        }
        btnUser.setOnClickListener{
            navigateToUser()
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToUser() {
        val intent = Intent(this, UserActivity::class.java)
        startActivity(intent)
    }
}