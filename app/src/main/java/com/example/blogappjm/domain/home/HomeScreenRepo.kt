package com.example.blogappjm.domain.home

import com.example.blogappjm.core.Resource
import com.example.blogappjm.data.model.Post

interface HomeScreenRepo {
    suspend fun getLatestPosts():Resource<List<Post>>
}