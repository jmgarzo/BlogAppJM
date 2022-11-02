package com.example.blogappjm.domain

import com.example.blogappjm.core.Resource
import com.example.blogappjm.data.model.Post
import com.example.blogappjm.data.remote.HomeScreenDataSource

class HomeScreenRepoImpl(private val dataSource: HomeScreenDataSource): HomeScreenRepo {
    override suspend fun getLatestPosts(): Resource<List<Post>> {
        TODO("Not yet implemented")
    }
}