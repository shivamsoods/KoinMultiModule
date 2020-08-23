package com.shivam.testmod.api

import com.shivam.testmod.model.InboxTestModel
import retrofit2.Response
import retrofit2.http.GET

interface InboxApiService {

    @GET("yesMember")
    suspend fun getTestMembers(): Response<InboxTestModel>
}