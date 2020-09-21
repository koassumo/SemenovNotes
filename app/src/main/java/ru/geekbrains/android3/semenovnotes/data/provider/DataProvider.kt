package ru.geekbrains.android3.semenovnotes.data.provider

import androidx.lifecycle.LiveData
import ru.geekbrains.android3.semenovnotes.data.entity.Note
import ru.geekbrains.android3.semenovnotes.data.model.NoteResult

interface DataProvider {
    fun subscribeToAllNotes() : LiveData<NoteResult>
    fun saveNote(note: Note) : LiveData<NoteResult>
    fun getNoteById(id: String) : LiveData<NoteResult>
}