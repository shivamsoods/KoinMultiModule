package com.shivam.testmod.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val inboxNetworkModule = module {
    scope(named("InboxScope")) {
        scoped(qualifier = named("InboxRetrofit")) { provideInboxRetrofit() }
    }
}

/**
 * Creates a Moshi object with Adapter Factory
 */
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()


/**
 * Provides a Retrofit Client to the application
 */
fun provideInboxRetrofit(): Retrofit = Retrofit.Builder()
    .baseUrl("https://someurl.com/api/")
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()

