package ru.com.bulat.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [DataModule::class, DomainModule::class])
interface AppComponent {

    fun activityComponentFactory() : ActivityComponent.Factory

    @Component.Factory
    interface AppComponentFactory {

        fun create(
            @BindsInstance context : Context,
            @BindsInstance timeMillis : Long,
        ) : AppComponent
    }
}