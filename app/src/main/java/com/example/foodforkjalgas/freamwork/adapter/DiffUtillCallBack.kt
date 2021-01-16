package com.example.foodforkjalgas.freamwork.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.foodforkjalgas.model.Model

class DiffUtillCallBack:DiffUtil.ItemCallback<Model>(){
    override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
return oldItem.featuredImage == oldItem.featuredImage
    }

    override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
         return  oldItem.featuredImage == oldItem.featuredImage
    }
}
