package com.danielecampogiani.demo.inject

import android.arch.lifecycle.ViewModel
import com.danielecampogiani.demo.main.MainService
import com.danielecampogiani.demo.main.MainServiceImpl
import com.danielecampogiani.demo.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
internal abstract class MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    internal abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    internal abstract fun bindMainService(serviceImpl: MainServiceImpl): MainService
}