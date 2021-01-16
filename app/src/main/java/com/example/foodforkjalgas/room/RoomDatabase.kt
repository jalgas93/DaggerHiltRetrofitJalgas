package com.example.foodforkjalgas.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [RoomModel::class], version = 1)
abstract class RoomDatabase : RoomDatabase() {
    abstract fun dao(): RoomDao

    companion object {
        val DATABASE_NAME: String = "database_db"
    }

}