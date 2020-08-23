package com.shivam.testmod.di

import com.shivam.testmod.api.InboxApiService
import com.shivam.testmod.ui.repository.InboxMainRepository
import com.shivam.testmod.ui.viewmodel.InboxMainViewModel
import com.shivam.testmod.util.InboxToastUtil
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent
import retrofit2.Retrofit



val inboxAppModule = module {
    factory { provideApiService(get()) }

    single { InboxMainRepository(get()) }
    viewModel { InboxMainViewModel(get()) }
    single { InboxToastUtil(androidContext()) }
}



private fun provideApiService(retrofit: Retrofit) =
    retrofit.create(InboxApiService::class.java)

