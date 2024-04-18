package com.example.myapplicationteste.android.notes_list

import com.example.myapplicationteste.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false,
)
