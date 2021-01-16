package com.example.foodforkjalgas.model


import com.google.gson.annotations.SerializedName

data class Model(
    @SerializedName("cooking_instructions")
    val cookingInstructions: Any,
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