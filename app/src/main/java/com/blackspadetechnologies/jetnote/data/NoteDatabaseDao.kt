package com.blackspadetechnologies.jetnote.data

import androidx.room.*
import com.blackspadetechnologies.jetnote.model.Note
import kotlinx.coroutines.flow.Flow


@Dao
interface NoteDatabaseDao {

    //Instead of LiveData, use Flow as the wrapper instead (using Compose)
    @Query("SELECT * from notes_tbl")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * from notes_tbl WHERE id =:id")
    suspend fun getNoteById(id: String): Note

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(note: Note)

    @Query("DELETE from notes_tbl")
    suspend fun deleteAll()

    @Delete
    suspend fun deleteNote(note: Note)

}