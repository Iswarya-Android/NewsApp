package com.example.newsapp.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.newsapp.ui.components.NewsItem
import com.example.newsapp.viewmodel.NewsViewModel

@Composable
fun NewsScreen(viewModel: NewsViewModel = viewModel()) {
    val newsItems = viewModel.newsFlow.collectAsLazyPagingItems()

    LazyColumn {
        items(newsItems.itemCount) { index ->
            val article = newsItems[index]
            article.let {
                if (it != null) {
                    NewsItem(article = it)
                }
            }
        }
    }
}
