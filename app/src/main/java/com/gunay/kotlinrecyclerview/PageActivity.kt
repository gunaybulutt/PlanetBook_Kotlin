package com.gunay.kotlinrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gunay.kotlinrecyclerview.databinding.ActivityMainBinding
import com.gunay.kotlinrecyclerview.databinding.ActivityPageBinding

class PageActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent //getIntent()
        val planet = intent.getSerializableExtra("Planet") as Planet
        binding.pageTextView.text = planet.name
        binding.imageView.setImageResource(planet.picture)



    }
}