package ru.com.bulat.dependencyinjectionstart.example2.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey
import ru.com.bulat.dependencyinjectionstart.example2.presentation.ExampleViewModel
import ru.com.bulat.dependencyinjectionstart.example2.presentation.ExampleViewModel2

@Module
interface ViewModelModule {

    @IntoMap
    @StringKey(value = "ExampleViewModel")
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel) : ViewModel

    @IntoMap
    @StringKey(value = "ExampleViewModel2")
    @Binds
    fun bindExampleViewModel2(impl: ExampleViewModel2) : ViewModel
}