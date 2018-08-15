package com.ensar.tmdbkotlin.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/ensar/tmdbkotlin/di/component/ApplicationComponent;", "", "app", "Lcom/ensar/tmdbkotlin/App;", "context", "Landroid/content/Context;", "inject", "", "mainActivityViewModel", "Lcom/ensar/tmdbkotlin/ui/main/MainActivityViewModel;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Component(modules = {com.ensar.tmdbkotlin.di.module.ApplicationModule.class, com.ensar.tmdbkotlin.di.module.NetModule.class, com.ensar.tmdbkotlin.di.module.DatabaseModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.ensar.tmdbkotlin.App app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences preferences();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.ensar.tmdbkotlin.ui.main.MainActivityViewModel mainActivityViewModel);
}