package com.example.blogappjm.domain.home

import com.example.blogappjm.core.Result
import com.example.blogappjm.data.model.Post

interface HomeScreenRepo {
    suspend fun getLatestPosts(): Result<List<Post>>
}