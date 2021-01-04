package com.example.daggerkotlin

import android.app.Application

class MyApplication  : Application(){
    val appComponent: appComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(MyApplication()))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

    fun appComponent() : AppComponent = appComponent
}