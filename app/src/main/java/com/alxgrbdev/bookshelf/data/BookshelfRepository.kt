package com.alxgrbdev.bookshelf.data

import com.alxgrbdev.bookshelf.model.Book
import com.alxgrbdev.bookshelf.network.BookshelfApiService

interface BookshelfRepository {
    suspend fun getBooks(): MutableList<Book>
}

class NetworkBookshelfRepository(
    private val bookshelfApiService: BookshelfApiService
) : BookshelfRepository {
    override suspend fun getBooks(): MutableList<Book> {
        val query = "jazz+history"
        val books = mutableListOf<Book>()
        val apiResponse = bookshelfApiService.getBooks(query)
        apiResponse.books.forEach { book ->
            books.add(book)
        }
        return books
    }
}
