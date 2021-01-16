package com.example.foodforkjalgas.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.foodforkjalgas.model.Models

@Dao
interface RoomDao {
@Insert(onConflict = OnConflictStrategy.REPLACE)
suspend fun insert(roomModel: RoomModel):Long

@Query("SELECT * FROM `database`")
suspend fun get():List<Models>

}