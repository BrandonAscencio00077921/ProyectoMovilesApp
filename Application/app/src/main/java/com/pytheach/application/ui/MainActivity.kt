package com.pytheach.application.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pytheach.application.R
import com.pytheach.application.databinding.ActivityMainBinding
import com.pytheach.application.databinding.LessonItemBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
