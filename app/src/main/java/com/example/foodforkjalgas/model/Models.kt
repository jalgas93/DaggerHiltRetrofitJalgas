package com.example.foodforkjalgas.model


import com.google.gson.annotations.SerializedName

data class Models(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<Model>
)