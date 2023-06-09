package com.ash.cleanarchitecturenoteapp.features.presentation.notes

import com.ash.cleanarchitecturenoteapp.features.domain.model.Note
import com.ash.cleanarchitecturenoteapp.features.domain.util.NoteOrder
import com.ash.cleanarchitecturenoteapp.features.domain.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
