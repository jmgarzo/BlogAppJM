package com.example.blogappjm.data.remote.home

import com.example.blogappjm.core.Result
import com.example.blogappjm.data.model.Post
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class HomeScreenDataSource {
    suspend fun getLatestPost(): Result<List<Post>> {
        val postList = mutableListOf<Post>()
        val querySnapshot = FirebaseFirestore.getInstance().collection("post").get().await()
        for(post in querySnapshot.documents){
            post.toObject(Post::class.java)?.let{
                postList.add(it)
            }
        }
        return Result.Success(postList)
    }
}