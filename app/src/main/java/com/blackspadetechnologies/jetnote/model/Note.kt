package com.blackspadetechnologies.jetnote.model

import java.time.LocalDateTime
import java.time.Year.now
import java.util.*

data class Note(
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: LocalDateTime = LocalDateTime.now()
)
