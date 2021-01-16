package com.example.foodforkjalgas.retrofit

import retrofit2.http.GET

interface NetworkRetrofit {

    @GET("recipe/search/?page=2&query=beef carrot potato onion")
    suspend fun gett():List<RetrofitEntityModel>
}