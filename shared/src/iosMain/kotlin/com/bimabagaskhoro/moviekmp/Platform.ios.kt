package com.bimabagaskhoro.moviekmp

import androidx.compose.ui.window.ComposeUIViewController

actual fun getPlatform(): String = "IOS App"

fun MainViewController() = ComposeUIViewController { MovieApp() }