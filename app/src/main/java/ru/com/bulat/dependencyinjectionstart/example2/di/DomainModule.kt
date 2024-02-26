package ru.com.bulat.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import ru.com.bulat.dependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import ru.com.bulat.dependencyinjectionstart.example2.domain.ExampleRepository

@Module
interface DomainModule {

    @Binds
    fun bindsRepository(impl: ExampleRepositoryImpl) : ExampleRepository
}