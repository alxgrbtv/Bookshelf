package com.alxgrbdev.bookshelf.network

import com.alxgrbdev.bookshelf.model.Book
import retrofit2.http.GET

interface BookshelfApiService {
    @GET("books")
    suspend fun getBooks(): List<Book>
}
