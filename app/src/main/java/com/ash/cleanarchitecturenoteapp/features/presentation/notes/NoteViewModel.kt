package com.ash.cleanarchitecturenoteapp.features.presentation.notes

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ash.cleanarchitecturenoteapp.features.domain.use_case.NoteUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val noteUseCases: NoteUseCases
): ViewModel()  {

    private val _state = mutableStateOf<NoteState>(NoteState())
    val state: State<NoteState> = _state
    fun onEvent(event: NotesEvent){
        when(event){
            is NotesEvent.Order -> {

            }
            is NotesEvent.DeleteNote -> {

            }
            is NotesEvent.RestoreNote -> {

            }
            is NotesEvent.ToggleOrderSection -> {
                _state.value = _state.value.copy(
                    isOrderSectionVisible = !state.value.isOrderSectionVisible
                )
            }
        }
    }
}