package com.example.freitag.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
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

        val team = dataset[position]


        holder.binding.nameTV.text = team.name
        holder.binding.scoreTV.text = team.score.toString()
//        holder.binding.scoreTV.text = "${team.score}"

        holder.binding.teamCV.setOnClickListener {

            team.score += 1
            Log.d("ScoreDebug", "$team")
            //holder.binding.scoreTV.text = team.score.toString()

            notifyItemChanged(holder.adapterPosition)
        }

        holder.binding.imageButton.setOnClickListener {

            //Team aus der Liste löschen
            dataset.removeAt(holder.adapterPosition)

            //Adapter informieren was sich verändert hat
            notifyItemRemoved(holder.adapterPosition)
            //notifyItemRangeChanged(position, dataset.size-1)
            //notifyDataSetChanged()

        }


    }