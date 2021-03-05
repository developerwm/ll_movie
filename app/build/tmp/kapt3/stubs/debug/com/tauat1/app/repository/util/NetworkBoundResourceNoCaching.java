package com.tauat1.app.repository.util;

import java.lang.System;

@kotlin.Suppress(names = {"LeakingThis"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u000bJ\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000bH%J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0011H&J\u0016\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H&J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H&J\u0014\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\rR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/tauat1/app/repository/util/NetworkBoundResourceNoCaching;", "UiObject", "RequestObject", "", "()V", "result", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/tauat1/app/repository/util/Resource;", "getResult", "()Landroidx/lifecycle/MediatorLiveData;", "asLiveData", "Landroidx/lifecycle/LiveData;", "createCall", "Lcom/tauat1/app/api/response/ApiResponse;", "handleApiEmptyResponse", "", "response", "Lcom/tauat1/app/api/response/ApiEmptyResponse;", "handleApiErrorResponse", "Lcom/tauat1/app/api/response/ApiErrorResponse;", "handleApiSuccessResponse", "Lcom/tauat1/app/api/response/ApiSuccessResponse;", "handleNetworkCall", "app_debug"})
public abstract class NetworkBoundResourceNoCaching<UiObject extends java.lang.Object, RequestObject extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.tauat1.app.repository.util.Resource<UiObject>> result = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.lifecycle.MediatorLiveData<com.tauat1.app.repository.util.Resource<UiObject>> getResult() {
        return null;
    }
    
    public final void handleNetworkCall(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.api.response.ApiResponse<RequestObject> response) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tauat1.app.repository.util.Resource<UiObject>> asLiveData() {
        return null;
    }
    
    public abstract void handleApiSuccessResponse(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.api.response.ApiSuccessResponse<RequestObject> response);
    
    public abstract void handleApiEmptyResponse(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.api.response.ApiEmptyResponse<RequestObject> response);
    
    public abstract void handleApiErrorResponse(@org.jetbrains.annotations.NotNull()
    com.tauat1.app.api.response.ApiErrorResponse<RequestObject> response);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.MainThread()
    protected abstract androidx.lifecycle.LiveData<com.tauat1.app.api.response.ApiResponse<RequestObject>> createCall();
    
    @androidx.annotation.MainThread()
    public NetworkBoundResourceNoCaching() {
        super();
    }
}