package com.ash.cleanarchitecturenoteapp.features.domain.use_case

import com.ash.cleanarchitecturenoteapp.features.domain.model.Note
import com.ash.cleanarchitecturenoteapp.features.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }
}