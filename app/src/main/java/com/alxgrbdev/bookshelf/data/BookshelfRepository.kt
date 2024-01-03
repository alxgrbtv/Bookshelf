package com.alxgrbdev.bookshelf.data

import com.alxgrbdev.bookshelf.model.Book
import com.alxgrbdev.bookshelf.network.BookshelfApiService

interface BookshelfRepository {
    suspend fun getBooks(): List<Book>
}

class NetworkBookshelfRepository(
    private val bookshelfApiService: BookshelfApiService
) : BookshelfRepository {
    override suspend fun getBooks(): List<Book> {
        return bookshelfApiService.getBooks()
    }
}
