package com.example.foodforkjalgas.freamwork.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.foodforkjalgas.R
import com.example.foodforkjalgas.model.Model
import com.example.foodforkjalgas.model.Models

class MainFragmentAdapter : RecyclerView.Adapter<MainFragmentAdapter.MainViewHolder>() {

    var model: List<Models> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }


    inner class MainViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_mainfragment, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

      fun bind(model:Model){

      }
    }

    override fun getItemCount(): Int = model.size

    companion object {
        private val USER_COMPARATOR = object : DiffUtil.ItemCallback<Model>() {
            override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
                return oldItem.featuredImage == oldItem.featuredImage
            }

            override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
                return oldItem.featuredImage == oldItem.featuredImage
            }

        }
    }
}