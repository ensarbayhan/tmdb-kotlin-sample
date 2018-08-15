package com.ensar.tmdbkotlin.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\r"}, d2 = {"Lcom/ensar/tmdbkotlin/di/module/ApplicationModule;", "", "app", "Lcom/ensar/tmdbkotlin/App;", "(Lcom/ensar/tmdbkotlin/App;)V", "getApp", "()Lcom/ensar/tmdbkotlin/App;", "setApp", "provideApp", "provideContext", "Landroid/content/Context;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    private com.ensar.tmdbkotlin.App app;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ensar.tmdbkotlin.App provideApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ensar.tmdbkotlin.App getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    com.ensar.tmdbkotlin.App p0) {
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.ensar.tmdbkotlin.App app) {
        super();
    }
}