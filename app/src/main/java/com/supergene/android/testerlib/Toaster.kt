package com.supergene.android.testerlib

import android.content.Context
import android.widget.Toast

class Toaster {

    companion object {

        fun toastShort(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun toastLong(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}