package com.example.foodforkjalgas.retrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class RetrofitEntityModel(

    @SerializedName("cooking_instructions")
    var cookingInstructions: Any,

    @SerializedName("date_added")
    val dateAdded: String,

    @SerializedName("date_updated")
    val dateUpdated: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("featured_image")
    val featuredImage: String,

    @SerializedName("ingredients")
    val ingredients: List<String>,

    @SerializedName("pk")
    val pk: Int,

    @SerializedName("publisher")
    val publisher: String,

    @SerializedName("rating")
    val rating: Int,

    @SerializedName("source_url")
    val sourceUrl: String,

    @SerializedName("title")
    val title: String
)