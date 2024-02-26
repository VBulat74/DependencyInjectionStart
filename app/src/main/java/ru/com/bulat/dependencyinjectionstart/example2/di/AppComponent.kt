package ru.com.bulat.dependencyinjectionstart.example2.di

import dagger.Component
import ru.com.bulat.dependencyinjectionstart.example2.presentation.MainActivity

@Component (modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface AppComponent {

    fun inject (activity : MainActivity)
}