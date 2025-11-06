package com.example.profileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profileapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // No extra logic needed as data is set from strings.xml
        // We can set a title for the activity
        title = getString(R.string.detail_title)
    }
}