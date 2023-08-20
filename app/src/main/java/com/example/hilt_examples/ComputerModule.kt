package com.example.hilt_examples

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Qualifier

@Module
@InstallIn(ActivityComponent::class)
abstract class ComputerModule {
    @WindowsComputerQualifier
    @Binds // 연결한다. 인터페이스의 구현을 제공한다고 보아도 된
    abstract fun windowsComputer(windows: Windows): Computers

    @LinuxComputerQualifier
    @Binds // 연결한다. 인터페이스의 구현을 제공한다고 보아도 된
    abstract fun linuxComputer(linux: Linux): Computers
}
@Qualifier
annotation class WindowsComputerQualifier

@Qualifier
annotation class LinuxComputerQualifier