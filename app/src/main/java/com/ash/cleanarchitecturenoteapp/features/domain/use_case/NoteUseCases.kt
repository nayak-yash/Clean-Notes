package com.ash.cleanarchitecturenoteapp.features.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote
) {
}