package com.danielecampogiani.demo.inject

import android.app.Application
import dagger.Module
import dagger.Provides


@Module
class AppModule(private val application: Application) {

    @Provides
    fun provideContext() = application

}