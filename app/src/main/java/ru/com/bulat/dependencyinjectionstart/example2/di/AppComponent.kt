package ru.com.bulat.dependencyinjectionstart.example2.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import ru.com.bulat.dependencyinjectionstart.example2.presentation.MainActivity

@AppScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity : MainActivity)

    @Component.Factory
    interface AppComponentFactory {

        fun create(
            @BindsInstance context : Context,
            @BindsInstance timeMillis : Long,
        ) : AppComponent
    }
}