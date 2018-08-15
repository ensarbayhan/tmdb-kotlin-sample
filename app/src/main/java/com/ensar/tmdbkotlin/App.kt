package com.ensar.tmdbkotlin

import com.ensar.tmdbkotlin.di.component.DaggerApplicationComponent
import com.ensar.tmdbkotlin.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

