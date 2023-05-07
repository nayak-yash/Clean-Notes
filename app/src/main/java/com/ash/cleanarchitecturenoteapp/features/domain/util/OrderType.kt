package com.ash.cleanarchitecturenoteapp.features.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
