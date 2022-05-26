package com.blackspadetechnologies.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.blackspadetechnologies.jetnote.model.Note
import com.blackspadetechnologies.jetnote.util.DateConverter
import com.blackspadetechnologies.jetnote.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class, UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDatabaseDao

}

/** Create Type converters from types that room doesn't recognize */