package com.ensar.tmdbkotlin.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/ensar/tmdbkotlin/di/module/NetModule;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "provideNonCachedOkHttpClient", "Lokhttp3/OkHttpClient;", "provideOkHttpClient", "provideRetrofit", "Lretrofit2/Retrofit$Builder;", "gson", "client", "app_debug"})
@dagger.Module()
public final class NetModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cached")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "non_cached")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideNonCachedOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit.Builder provideRetrofit(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "cached")
    okhttp3.OkHttpClient client) {
        return null;
    }
    
    public NetModule() {
        super();
    }
}