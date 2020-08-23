package com.shivam.testmod.ui.activity

import android.os.Bundle
import androidx.lifecycle.Observer
import com.shivam.testmod.R


class MainInboxActivityInbox : InboxBaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_inbox)

        inboxToastUtil.showShortToast("You are in Inbox Activity")

        mainViewModel.getTestMembers().observe(this, Observer {
            inboxToastUtil.showShortToast("You entered inbox viewmodel")
            if (it.isSuccessful) {

                inboxToastUtil.showShortToast("Hey Inbox api call success")
            } else {
                inboxToastUtil.showShortToast("Sorry Inbox api call fail")
            }
        })

    }
}