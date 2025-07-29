package com.example.newsapp.data.repository


import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.newsapp.data.api.RetrofitInstance
import com.example.newsapp.data.model.Article
import com.example.newsapp.data.paging.NewsPagingSource

class NewsRepository {
    fun getNews(apiKey: String): Pager<Int, Article> {
        return Pager(
            config = PagingConfig(pageSize = 20),
            pagingSourceFactory = { NewsPagingSource(RetrofitInstance.api, apiKey) }
        )
    }
}