package com.mkdev.mvi_architecture_android_beginners.ui.main.intent

sealed class MainIntent {
    object FetchUser : MainIntent()
}
