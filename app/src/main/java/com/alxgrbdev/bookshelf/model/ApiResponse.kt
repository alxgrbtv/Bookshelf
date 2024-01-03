package com.alxgrbdev.bookshelf.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("items") val books: List<Book>
)

data class Book(
    @SerializedName("id") val id: String,
    @SerializedName("volumeInfo") val bookInfo: BookInfo
)

data class BookInfo(
    @SerializedName("imageLinks") val imageLinks: ImageLinks
)

data class ImageLinks(
    @SerializedName("thumbnail") private val _thumbnail: String
) {
    val thumbnail: String
        get() = _thumbnail.replace("http://", "https://")
}
