package com.tauat1.app.repository.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/tauat1/app/repository/util/AppExecutors;", "", "()V", "diskIO", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getDiskIO", "()Ljava/util/concurrent/ExecutorService;", "mainThreadExecutor", "Lcom/tauat1/app/repository/util/AppExecutors$MainThreadExecutor;", "getMainThreadExecutor", "()Lcom/tauat1/app/repository/util/AppExecutors$MainThreadExecutor;", "MainThreadExecutor", "app_debug"})
public final class AppExecutors {
    private final java.util.concurrent.ExecutorService diskIO = null;
    @org.jetbrains.annotations.NotNull()
    private final com.tauat1.app.repository.util.AppExecutors.MainThreadExecutor mainThreadExecutor = null;
    
    public final java.util.concurrent.ExecutorService getDiskIO() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tauat1.app.repository.util.AppExecutors.MainThreadExecutor getMainThreadExecutor() {
        return null;
    }
    
    public AppExecutors() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/tauat1/app/repository/util/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mainThreadHandler", "Landroid/os/Handler;", "execute", "", "command", "Ljava/lang/Runnable;", "app_debug"})
    public static final class MainThreadExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mainThreadHandler = null;
        
        @java.lang.Override()
        public void execute(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable command) {
        }
        
        public MainThreadExecutor() {
            super();
        }
    }
}