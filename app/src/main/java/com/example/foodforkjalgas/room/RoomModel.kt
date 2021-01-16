package com.example.foodforkjalgas.room

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity(tableName = "database")
class RoomModel (
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