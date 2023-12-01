package com.example.freitag.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.freitag.MainActivity
import com.example.freitag.data.ForMyLife
import com.example.freitag.data.Gift
import com.example.freitag.data.RestOfTheWorld
import com.example.freitag.data.Technik
import com.example.freitag.databinding.ListItemBinding

class Adapter(val dataset: MutableList<Gift>,
) : RecyclerView.Adapter<Adapter.TeamViewHolder>() {


    inner class TeamViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
    //weis noch nicht was sinnvoller ist

    /*var datasetTechnik:List<Technik> = emptyList()
    var datasetLife:List<ForMyLife> = emptyList()
    var datasetWorld:List<RestOfTheWorld> = emptyList()

     */
    var wishList: MutableList<Gift> = mutableListOf()

    fun addGift(newGift: Gift) {
        wishList.add(0, newGift)
        notifyItemInserted(0)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TeamViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {

        val gift = dataset[position]


        holder.binding.giftNameCardTV.text = gift.name
        holder.binding.giftCardIV.setImageResource(gift.picture)



    }
}