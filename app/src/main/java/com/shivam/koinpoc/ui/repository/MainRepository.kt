package com.shivam.koinpoc.ui.repository

import com.shivam.koinpoc.api.ApiService


class MainRepository(private val apiService: ApiService) {
    suspend fun getTestMembers() = apiService.getTestMembers()

}