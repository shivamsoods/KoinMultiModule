package com.shivam.testmod.ui.repository

import com.shivam.testmod.api.InboxApiService

class InboxMainRepository(private val apiService: InboxApiService) {
    suspend fun getTestMembers() = apiService.getTestMembers()

}