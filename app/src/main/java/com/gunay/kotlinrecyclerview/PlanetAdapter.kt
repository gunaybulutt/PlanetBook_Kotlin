package com.gunay.kotlinrecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.gunay.kotlinrecyclerview.databinding.RowRecyclerBinding

class PlanetAdapter(val PlanetList : ArrayList<Planet>): RecyclerView.Adapter<PlanetAdapter.PlanetHolder>() {

    class PlanetHolder(val binding : RowRecyclerBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetHolder {
        val binding = RowRecyclerBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PlanetHolder(binding)
    }

    override fun getItemCount(): Int {
        return PlanetList.size
    }

    override fun onBindViewHolder(holder: PlanetHolder, position: Int) {
        holder.binding.recyclerText.text = PlanetList.get(position).name
        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context,PageActivity::class.java)
            intent.putExtra("Planet",PlanetList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }


}