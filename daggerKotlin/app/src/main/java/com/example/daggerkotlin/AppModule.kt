package com.example.daggerkotlin

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (val app: MyApplication){
    @Provides
    @Singleton
    fun provideApp()= app
}