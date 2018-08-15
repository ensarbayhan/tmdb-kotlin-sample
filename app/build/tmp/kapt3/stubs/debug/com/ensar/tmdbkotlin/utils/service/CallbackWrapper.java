package com.ensar.tmdbkotlin.utils.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0014R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/ensar/tmdbkotlin/utils/service/CallbackWrapper;", "T", "", "Lio/reactivex/observers/DisposableObserver;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "weakReference", "Ljava/lang/ref/WeakReference;", "getWeakReference", "()Ljava/lang/ref/WeakReference;", "setWeakReference", "(Ljava/lang/ref/WeakReference;)V", "onComplete", "", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "onSuccess", "app_debug"})
public abstract class CallbackWrapper<T extends java.lang.Object> extends io.reactivex.observers.DisposableObserver<T> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.ref.WeakReference<android.app.Application> weakReference;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.ref.WeakReference<android.app.Application> getWeakReference() {
        return null;
    }
    
    public final void setWeakReference(@org.jetbrains.annotations.Nullable()
    java.lang.ref.WeakReference<android.app.Application> p0) {
    }
    
    protected abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    T t);
    
    @java.lang.Override()
    public void onNext(@org.jetbrains.annotations.NotNull()
    T t) {
    }
    
    @java.lang.Override()
    public void onError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    @java.lang.Override()
    public void onComplete() {
    }
    
    public CallbackWrapper(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}