package com.example.foodforkjalgas.repository


import com.example.foodforkjalgas.model.Model
import com.example.foodforkjalgas.model.Models
import com.example.foodforkjalgas.retrofit.MapperRetrofit
import com.example.foodforkjalgas.retrofit.NetworkRetrofit
import com.example.foodforkjalgas.room.ChacheMapper
import com.example.foodforkjalgas.room.RoomDao
import com.example.foodforkjalgas.util.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainRepository constructor(
    private val networkRetrofit: NetworkRetrofit,
    private val retrofitMapper: MapperRetrofit,
    private val roomDao: RoomDao,
    private val chacheMapper: ChacheMapper
) {
    suspend fun getModel(): Flow<DataState<List<Models>>> = flow {
        emit(DataState.Loading)
        delay(1000)

            val networkRetrofit = networkRetrofit.gett()
            val netMapper = retrofitMapper.mapFromEntityList(networkRetrofit)
            for (mapper in netMapper) {
                roomDao.insert(chacheMapper.mapToEntity(mapper))

            }
            val cacheModel = roomDao.get()
            emit(DataState.Success(cacheModel))

    }
}