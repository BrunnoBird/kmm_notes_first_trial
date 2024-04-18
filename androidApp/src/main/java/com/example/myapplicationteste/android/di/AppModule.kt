package com.example.myapplicationteste.android.di

import android.app.Application
import app.cash.sqldelight.db.SqlDriver
import com.example.myapplicationteste.data.local.DatabaseDriverFactory
import com.example.myapplicationteste.data.note.SqlDelightNoteDataSource
import com.example.myapplicationteste.domain.note.NoteDataSource
import com.jetbrains.spacetutorial.cache.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(AppDatabase(driver))
    }
}