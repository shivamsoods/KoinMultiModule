package com.shivam.koinpoc.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.shivam.koinpoc.R
import com.shivam.testmod.ui.activity.MainInboxActivityInbox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastUtil.showShortToast("You are in App Activity")

        mainViewModel.getTestMembers().observe(this, Observer {
            toastUtil.showShortToast("You are in App ViewModel")

            if (it.isSuccessful) {
                Log.d("hhh", "onCreate: $it")
                toastUtil.showShortToast("You are in App Api call success")
            } else {
                toastUtil.showShortToast("You are in App Api call failure")
            }
        })

        btnInbox.setOnClickListener {
            startActivity(Intent(this, MainInboxActivityInbox::class.java))
        }
    }
}