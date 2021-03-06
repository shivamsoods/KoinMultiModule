package com.shivam.koinpoc.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val networkModule = module {
    single { provideRetrofit() }
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
private fun provideRetrofit() = Retrofit.Builder()
    .baseUrl("https://my-json-server.typicode.com/typicode/demo/")
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()



