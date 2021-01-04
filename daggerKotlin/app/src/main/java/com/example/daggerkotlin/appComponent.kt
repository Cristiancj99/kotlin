package com.example.daggerkotlin

import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface appComponent{
    fun inject (app:MyApplication)
    fun inject (mainModule: MainModule) : MainComponent
}