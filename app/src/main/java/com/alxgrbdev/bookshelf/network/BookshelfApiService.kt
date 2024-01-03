package com.alxgrbdev.bookshelf.network

import com.alxgrbdev.bookshelf.model.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BookshelfApiService {
    @GET("volumes")
    suspend fun getBooks(@Query("q") query: String): ApiResponse
}
