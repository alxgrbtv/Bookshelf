package com.alxgrbdev.bookshelf

import android.app.Application
import com.alxgrbdev.bookshelf.data.AppContainer
import com.alxgrbdev.bookshelf.data.DefaultAppContainer

class BookshelfApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}
