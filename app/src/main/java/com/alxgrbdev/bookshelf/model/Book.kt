package com.alxgrbdev.bookshelf.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val id: String,
    @SerialName(value = "thumbnail")
    val imgSrc: String
)
