package com.danielecampogiani.demo.inject

import com.danielecampogiani.demo.main.MainFragment
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [
    AppModule::class,
    ViewModelBuilder::class,
    MainModule::class
])
interface AppComponent {

    fun inject(mainFragment: MainFragment)
}