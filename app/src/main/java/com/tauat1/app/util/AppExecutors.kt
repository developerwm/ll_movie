package com.tauat1.app.repository.util

import android.os.Handler
import android.os.Looper
import java.util.concurrent.Executor
import java.util.concurrent.Executors

public class AppExecutors {
    val diskIO = Executors.newSingleThreadExecutor()
    val mainThreadExecutor = MainThreadExecutor()

    class MainThreadExecutor : Executor {
        private val mainThreadHandler = Handler(Looper.getMainLooper())
        override fun execute(command: Runnable) {
            mainThreadHandler.post(command)
        }
    }
}