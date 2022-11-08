package com.example.blogappjm.domain.home

import com.example.blogappjm.core.Result
import com.example.blogappjm.data.model.Post
import com.example.blogappjm.data.remote.home.HomeScreenDataSource

class HomeScreenRepoImpl(private val dataSource: HomeScreenDataSource): HomeScreenRepo {
    override suspend fun getLatestPosts(): Result<List<Post>> =  dataSource.getLatestPost()
}