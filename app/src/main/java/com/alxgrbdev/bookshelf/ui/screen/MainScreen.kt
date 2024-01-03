package com.alxgrbdev.bookshelf.ui.screen

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    BookshelfScreen(
        modifier = modifier
    )
}

@Composable
fun BookshelfScreen(modifier: Modifier) {
    BookCard(
        modifier = modifier
    )
}

@Composable
fun BookCard(modifier: Modifier) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Text(
            text = "Book Card",
            modifier = Modifier
        )
    }
}
