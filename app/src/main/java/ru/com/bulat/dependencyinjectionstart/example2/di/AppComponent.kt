package ru.com.bulat.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.com.bulat.dependencyinjectionstart.example2.presentation.MainActivity

@Component (modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun inject (activity : MainActivity)

    @Component.Builder
    interface AppComponentBuilder {

        @BindsInstance
        fun context(context : Context) : AppComponentBuilder

        @BindsInstance
        fun timeMillis(timeMillis: Long) : AppComponentBuilder

        fun build() : AppComponent
    }
}