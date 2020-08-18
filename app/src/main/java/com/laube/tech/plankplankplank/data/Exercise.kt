package com.laube.tech.plankplankplank.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exercise")
data class Exercise(
    @PrimaryKey
    val id: Long,
    val type: String,
    val time: Long,
    val reps: Int,
    val date: Long
)