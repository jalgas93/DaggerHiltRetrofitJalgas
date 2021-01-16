package com.example.foodforkjalgas.business.data.cache

import com.example.foodforkjalgas.model.Models

interface CacheDataSource {

    suspend fun insert(models: Models):Long
    suspend fun insertList(modes:List<Models>)
    suspend fun get():List<Models>
}