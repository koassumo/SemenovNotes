package ru.geekbrains.android3.semenovnotes.data

import ru.geekbrains.android3.semenovnotes.data.entity.Note

object NotesRepository {
    private val notes: List<Note> = listOf(
        Note(
            "Первая заметка",
            "Текст первой заметки. Не очень длинный, но интересный",
             Note.Color.WHITE
        ),
        Note(
            "Вторая заметка",
            "Текст второй заметки. Не очень длинный, но интересный",
            Note.Color.VIOLET
        ),
        Note(
            "Третья заметка",
            "Текст третьей заметки. Не очень длинный, но интересный",
            Note.Color.YELLOW
        ),
        Note(
            "Четвертая заметка",
            "Текст четвертой заметки. Не очень длинный, но интересный",
            Note.Color.RED
        ),
        Note(
            "Пятая заметка",
            "Текст пятой заметки. Не очень длинный, но интересный",
            Note.Color.PINK
        ),
        Note(
            "Шестая заметка",
            "Текст шестой заметки. Не очень длинный, но интересный",
            Note.Color.GREEN
        )
    )

    fun getNotes(): List<Note> {
        return notes
    }
}