package com.shivam.koinpoc.di

import com.shivam.koinpoc.api.ApiService
import com.shivam.koinpoc.ui.repository.MainRepository
import com.shivam.koinpoc.ui.viewmodel.MainViewModel
import com.shivam.koinpoc.util.ToastUtil
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit


val appModule = module {
    factory { provideApiService(get()) }
    single { MainRepository(get()) }

    viewModel { MainViewModel(get()) }

    single { ToastUtil(androidContext()) }
}

private fun provideApiService(retrofit: Retrofit) =
    retrofit.create(ApiService::class.java)
