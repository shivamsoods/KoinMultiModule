package com.shivam.koinpoc.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.shivam.koinpoc.ui.repository.MainRepository
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getTestMembers() = liveData(Dispatchers.IO) {
        emit(mainRepository.getTestMembers())
    }
}