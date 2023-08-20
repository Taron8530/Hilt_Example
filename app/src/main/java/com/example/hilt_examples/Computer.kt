package com.example.hilt_examples

import android.util.Log
import javax.inject.Inject

val TAG = "Computer"
//class Computer {
//    fun booting(){
//        Log.i(TAG, "Computer booting :) ")
//    }
//    fun shutdown(){
//        Log.i(TAG, "Computer shutdown ")
//    }
//}
class Computer
@Inject constructor(){
    fun booting(){
        Log.i(TAG, "booting: ")
    }
    fun shutdown(){
        Log.i(TAG, "shutdown: ")
    }
}