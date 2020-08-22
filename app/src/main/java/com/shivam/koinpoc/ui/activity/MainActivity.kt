package com.shivam.koinpoc.ui.activity

import android.os.Bundle
import androidx.lifecycle.Observer
import com.shivam.koinpoc.R
import com.shivam.koinpoc.ui.activity.BaseActivity
import com.shivam.koinpoc.ui.viewmodel.MainViewModel
import com.shivam.koinpoc.util.ToastUtil
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastUtil.showLongToast("HEyyyy Long")

        mainViewModel.getTestMembers().observe(this, Observer {
            if (it.isSuccessful) {

                toastUtil.showShortToast("Hey World")
            } else {
                toastUtil.showShortToast("Sorry No World")
            }
        })
    }
}