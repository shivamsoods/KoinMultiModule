package com.shivam.koinpoc.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shivam.koinpoc.ui.viewmodel.MainViewModel
import com.shivam.koinpoc.util.ToastUtil
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

open class BaseActivity : AppCompatActivity() {
     val mainViewModel by viewModel<MainViewModel>()
     val toastUtil: ToastUtil by inject()

     override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)

     }
}