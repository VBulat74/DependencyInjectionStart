package ru.com.bulat.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl

@Module
interface DataModule {

    @Binds
    fun bindsLocalDataSource(impl : ExampleLocalDataSourceImpl) : ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl : ExampleRemoteDataSourceImpl) : ExampleRemoteDataSource
}