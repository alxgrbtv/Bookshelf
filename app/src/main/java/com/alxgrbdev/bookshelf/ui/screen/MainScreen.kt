package com.alxgrbdev.bookshelf.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.alxgrbdev.bookshelf.model.Book
import com.alxgrbdev.bookshelf.model.ImageLinks
import com.alxgrbdev.bookshelf.ui.viewmodel.BookshelfUiState

@Composable
fun MainScreen(
    bookshelfUiState: BookshelfUiState,
    modifier: Modifier = Modifier,
) {
    when (bookshelfUiState) {
        is BookshelfUiState.Loading -> LoadingScreen(modifier = modifier)
        is BookshelfUiState.Success -> BookshelfScreen(books = bookshelfUiState.books, modifier = modifier)
        else -> ErrorScreen(modifier = modifier)
    }
}

@Composable
fun ErrorScreen(modifier: Modifier) {
    Text(text = "Error")
}

@Composable
fun LoadingScreen(modifier: Modifier) {
    Text(text = "Loading")
}

@Composable
fun BookshelfScreen(modifier: Modifier, books: MutableList<Book>) {
    BookCard(
        book = books[0],
        modifier = modifier
    )
}

@Composable
fun BookCard(book: Book, modifier: Modifier) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Text(
            text = "Book Card",
            modifier = Modifier
        )
        AsyncImage(
            model = ImageRequest.Builder(context = LocalContext.current)
                .data(book.bookInfo.imageLinks.thumbnail)
                .crossfade(true)
                .build(),
            contentDescription = "Book Thumbnail",
            modifier = Modifier.fillMaxWidth()
        )
    }
}
