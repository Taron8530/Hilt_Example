package com.example.hilt_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//     lateinit var computer: Computer // 기본 사용 방법
//     @Inject lateinit var computer: Computer // 힐트 인젝트
//     @Inject lateinit var windowsComputer : Windows // 윈도우 컴퓨터 힐트 인젝트
     @LinuxComputerQualifier
     @Inject lateinit var computers : Computers // 모듈 사용 인젝트
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        computer = Computer()
        computers.booting()
        computers.shutdown()
//
//        windowsComputer.booting()
//        windowsComputer.shutdown()
//        computers.booting()
//        computers.shutdown()


    }
}