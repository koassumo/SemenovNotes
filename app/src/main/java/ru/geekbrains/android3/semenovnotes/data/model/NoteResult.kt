package ru.geekbrains.android3.semenovnotes.data.model

sealed class NoteResult {
    data class Success<out T>(val data: T): NoteResult()
    data class Error(val error: Throwable): NoteResult()
}