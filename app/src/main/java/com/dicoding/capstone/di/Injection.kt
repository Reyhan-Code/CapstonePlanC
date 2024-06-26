package com.dicoding.capstone.di

import android.content.Context
import com.dicoding.capstone.remote.database.FungusDb
import com.dicoding.capstone.repository.FungusRepository

object Injection {
    fun provideRepository(context: Context): FungusRepository {
        val database = FungusDb.getInstance(context)
        val recipeDao = database.recipeDao()
        return FungusRepository.getInstance(recipeDao)
    }
}