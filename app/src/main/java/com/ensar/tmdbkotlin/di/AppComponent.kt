package com.ensar.tmdbkotlin.di

import android.app.Application
import com.ensar.tmdbkotlin.App
import com.ensar.tmdbkotlin.di.module.AppModule
import com.ensar.tmdbkotlin.di.module.DatabaseModule
import com.ensar.tmdbkotlin.di.module.NetModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Ensar Bayhan on 9/18/2018.
 */

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, AppModule::class, NetModule::class,
    DatabaseModule::class, ActivityBuilder::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: App)
}