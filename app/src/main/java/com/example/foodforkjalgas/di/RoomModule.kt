package com.example.foodforkjalgas.di

import android.content.Context
import androidx.room.Room
import com.example.foodforkjalgas.room.RoomDao
import com.example.foodforkjalgas.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn
object RoomModule {

    @Singleton
    @Provides
    fun provideRoomDB(@ApplicationContext context: Context): RoomDatabase {
        return Room.databaseBuilder(context, RoomDatabase::class.java, RoomDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()

    }

    @Singleton
    @Provides
    fun provideRoomDao(roomDatabase: RoomDatabase): RoomDao {
        return roomDatabase.dao()
    }

}