package com.konar.a7minutesworkoutapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history-table")
data class HistoryEntity(
    @PrimaryKey
    var date: String = ""
)
