package com.shivam.testmod.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shivam.testmod.di.inboxAppModule
import com.shivam.testmod.di.inboxNetworkModule
import com.shivam.testmod.ui.viewmodel.InboxMainViewModel
import com.shivam.testmod.util.InboxToastUtil
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

open class InboxBaseActivity : AppCompatActivity() {

    val mainViewModel by viewModel<InboxMainViewModel>()
    val inboxToastUtil: InboxToastUtil by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadKoinModules(listOf(inboxNetworkModule, inboxAppModule))


    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(listOf(inboxAppModule, inboxNetworkModule))
    }
}