package com.example.newsapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.example.newsapp.data.repository.NewsRepository

class NewsViewModel : ViewModel() {

    private val repository = NewsRepository()

    val newsFlow = repository.getNews(apiKey = "38c355c9ea1b4ab481da1372c5cbb745")
        .flow
        .cachedIn(viewModelScope)
}