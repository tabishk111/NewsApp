package com.androiddevs.newsapp.models

import com.androiddevs.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)