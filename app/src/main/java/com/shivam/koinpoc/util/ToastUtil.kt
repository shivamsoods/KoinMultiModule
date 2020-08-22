package com.shivam.koinpoc.util

import android.content.Context
import android.text.TextUtils
import android.widget.Toast

class ToastUtil(private var context: Context) {

    fun showShortToast(message: String?) {
        if (TextUtils.isEmpty(message)) {
            return
        } else {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }


    fun showLongToast(message: String?) {
        if (TextUtils.isEmpty(message)) {
            return
        } else {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }

}

