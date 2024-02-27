package ru.com.bulat.dependencyinjectionstart.example2.di

import dagger.BindsInstance
import dagger.Subcomponent
import ru.com.bulat.dependencyinjectionstart.example2.domain.IdQualifier
import ru.com.bulat.dependencyinjectionstart.example2.domain.NameQualifier
import ru.com.bulat.dependencyinjectionstart.example2.presentation.MainActivity
import ru.com.bulat.dependencyinjectionstart.example2.presentation.MainActivity2

@Subcomponent (
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity : MainActivity)
    fun inject(activity : MainActivity2)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String,
        ) :ActivityComponent
    }
}