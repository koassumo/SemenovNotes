package ru.geekbrains.android3.semenovnotes.data.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Note(
    var id: String,
    var title: String = "",
    var text: String = "",
    var color: Color = Color.WHITE
) : Parcelable {

    enum class Color {
        WHITE,
        VIOLET,
        YELLOW,
        RED,
        PINK,
        GREEN
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true

        if (javaClass != other?.javaClass) return false
         other as Note
        if (id != other.id) return false
        return true
    }
}