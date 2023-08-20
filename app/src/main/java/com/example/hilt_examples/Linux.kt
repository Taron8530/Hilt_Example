package com.example.hilt_examples

import android.util.Log
import javax.inject.Inject

class Linux @Inject constructor() : Computers {
    override fun booting() {
        Log.i(TAG, "Linux Computer booting :)")
    }

    override fun shutdown() {
        Log.i(TAG, "Linux Computer shutdown :(")
    }
}