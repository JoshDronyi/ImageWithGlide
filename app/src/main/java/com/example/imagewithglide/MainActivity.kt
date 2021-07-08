package com.example.imagewithglide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imagewithglide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding : ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        with(binding){
            imageView.loadWithGlide("https://cdn.shibe.online/shibes/c512f0c378123c65732c29118004063d68cb37d2.jpg")
        }
    }
}