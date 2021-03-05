package com.tauat1.app.repository.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000bH%J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH%J\u001b\u0010\u0012\u001a\u00028\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0015\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00018\u0001H%\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u000f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003J\u0017\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/tauat1/app/repository/util/NetworkBoundResource;", "CacheObject", "RequestObject", "", "appExecutors", "Lcom/tauat1/app/repository/util/AppExecutors;", "(Lcom/tauat1/app/repository/util/AppExecutors;)V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/tauat1/app/repository/util/Resource;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lcom/tauat1/app/api/response/ApiResponse;", "fetchFromNetwork", "", "dbSource", "loadFromDb", "processResponse", "response", "Lcom/tauat1/app/api/response/ApiSuccessResponse;", "(Lcom/tauat1/app/api/response/ApiSuccessResponse;)Ljava/lang/Object;", "saveCallResult", "item", "(Ljava/lang/Object;)V", "setValue", "newValue", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<CacheObject extends java.lang.Object, RequestObject extends java.lang.Object> {
    private final androidx.lifecycle.MediatorLiveData<com.tauat1.app.repository.util.Resource<CacheObject>> result = null;
    private final com.tauat1.app.repository.util.AppExecutors appExecutors = null;
    
    @androidx.annotation.MainThread()
    private final void setValue(com.tauat1.app.repository.util.Resource<CacheObject> newValue) {
    }
    
    private final void fetchFromNetwork(androidx.lifecycle.LiveData<CacheObject> dbSource) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<CacheObject>> asLiveData() {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    protected RequestObject processResponse(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.api.response.ApiSuccessResponse<RequestObject> response) {
        return null;
    }
    
    @androidx.annotation.WorkerThread()
    protected abstract void saveCallResult(@org.jetbrains.annotations.Nullable()
    RequestObject item);
    
    @androidx.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    CacheObject data);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<CacheObject> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.tauat1.app.api.response.ApiResponse<RequestObject>> createCall();
    
    @androidx.annotation.MainThread()
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.repository.util.AppExecutors appExecutors) {
        super();
    }
}