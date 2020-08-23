package com.shivam.koinpoc.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shivam.koinpoc.di.appModule
import com.shivam.koinpoc.di.networkModule
import com.shivam.koinpoc.ui.viewmodel.MainViewModel
import com.shivam.koinpoc.util.ToastUtil
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

open class BaseActivity : AppCompatActivity() {
     val mainViewModel by viewModel<MainViewModel>()
     val toastUtil: ToastUtil by inject()

     override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          loadKoinModules(listOf(networkModule, appModule))

     }

     override fun onDestroy() {
          super.onDestroy()
          unloadKoinModules(listOf(networkModule, appModule))
     }
}