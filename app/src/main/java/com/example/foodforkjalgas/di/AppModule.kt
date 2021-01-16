package com.example.foodforkjalgas.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module

object AppModule {
    @Singleton
    @Provides
    fun someString(): String {
        return "It is a some string!!!"
    }
}