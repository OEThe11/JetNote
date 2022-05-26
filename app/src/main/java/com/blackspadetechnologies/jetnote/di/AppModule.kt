package com.blackspadetechnologies.jetnote.di

import android.content.Context
import androidx.room.Room
import com.blackspadetechnologies.jetnote.data.NoteDatabase
import com.blackspadetechnologies.jetnote.data.NoteDatabaseDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Tells hilt how to provider bindings

//A hilt component for a singleton
@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDatabase: NoteDatabase) : NoteDatabaseDao
    = noteDatabase.noteDao()

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) : NoteDatabase
    = Room.databaseBuilder(
        context,
        NoteDatabase::class.java,
        "some_notes")
        .fallbackToDestructiveMigration()
        .build()
}

/** Once the AppModule is completed, Clean and Rebuild the app
 * so that the object call works in the background*/