package com.shivam.koinpoc.api

import com.shivam.koinpoc.model.TestModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getTestMembers(): Response<List<TestModel>>
}