package com.shivam.koinpoc

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinPOC : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()

    }


    private fun initializeKoin() {
        startKoin {
            androidLogger()
            androidContext(this@KoinPOC)
//            modules(
//                listOf(inboxAppModule, inboxNetworkModule)
//            )
        }

    }
}