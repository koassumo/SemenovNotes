package ru.geekbrains.android3.semenovnotes.ui.note

import androidx.lifecycle.ViewModel
import ru.geekbrains.android3.semenovnotes.data.NotesRepository
import ru.geekbrains.android3.semenovnotes.data.entity.Note

class NoteViewModel : ViewModel() {

    private var pendingNote: Note? = null

    fun save(note: Note) {
        pendingNote = note
    }

    override fun onCleared() {
        pendingNote?.let {
            NotesRepository.saveNote(it)
        }
    }

}
