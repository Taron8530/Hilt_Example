package com.example.hilt_examples

import android.util.Log
import javax.inject.Inject

class Windows @Inject constructor() : Computers{
    override fun booting() {
        Log.i(TAG, "Windows Computer booting :)")
    }

    override fun shutdown() {
        Log.i(TAG, "Windows Computer shutdown :(")
    }
}