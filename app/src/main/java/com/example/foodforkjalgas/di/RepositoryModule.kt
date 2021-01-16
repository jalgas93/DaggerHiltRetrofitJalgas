package com.example.foodforkjalgas.di

import com.example.foodforkjalgas.repository.MainRepository
import com.example.foodforkjalgas.retrofit.MapperRetrofit
import com.example.foodforkjalgas.retrofit.NetworkRetrofit
import com.example.foodforkjalgas.room.ChacheMapper
import com.example.foodforkjalgas.room.RoomDao
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Singleton
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMainRepository(
        networkRetrofit: NetworkRetrofit,
        mapperRetrofit: MapperRetrofit,
        roomDao: RoomDao,
        chacheMapper: ChacheMapper
    ):MainRepository{
        return MainRepository(networkRetrofit = networkRetrofit,retrofitMapper = mapperRetrofit,
            roomDao = roomDao,chacheMapper = chacheMapper)

    }
}