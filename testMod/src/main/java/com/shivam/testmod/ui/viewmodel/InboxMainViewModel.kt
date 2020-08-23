package com.shivam.testmod.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.shivam.testmod.ui.repository.InboxMainRepository
import kotlinx.coroutines.Dispatchers

class InboxMainViewModel(private val inboxMainRepository: InboxMainRepository) : ViewModel() {

    fun getTestMembers() = liveData(Dispatchers.IO) {
        emit(inboxMainRepository.getTestMembers())
    }
}