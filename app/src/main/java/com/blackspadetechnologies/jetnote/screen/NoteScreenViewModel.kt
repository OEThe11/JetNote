package com.blackspadetechnologies.jetnote.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.blackspadetechnologies.jetnote.data.NotesDataSource
import com.blackspadetechnologies.jetnote.model.Note

class NoteScreenViewModel : ViewModel() {
    var noteList = mutableStateListOf<Note>()


    init {
        noteList.addAll(NotesDataSource(). loadNotes())
    }

    fun addNote(note: Note){
        noteList.add(note)

    }

    fun removeNote(note: Note){
        noteList.remove(note)
    }

    fun getAllNotes(): List<Note>{
        return noteList
    }
}