package com.ash.cleanarchitecturenoteapp.features.presentation.notes

import com.ash.cleanarchitecturenoteapp.features.domain.model.Note
import com.ash.cleanarchitecturenoteapp.features.domain.util.NoteOrder

sealed class NotesEvent{

    data class Order(val note: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
