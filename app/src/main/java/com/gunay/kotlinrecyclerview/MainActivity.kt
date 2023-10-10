package com.gunay.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gunay.kotlinrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var planetList: ArrayList<Planet>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        planetList = ArrayList<Planet>()

        val earth = Planet("Earth",R.drawable.earth)
        val mars = Planet("Mars",R.drawable.mars)
        val neptune = Planet("Neptune",R.drawable.neptune)

        planetList.add(earth)
        planetList.add(mars)
        planetList.add(neptune)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = PlanetAdapter(planetList)
        binding.recyclerView.adapter= adapter

    }
}