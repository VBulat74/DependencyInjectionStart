package ru.com.bulat.dependencyinjectionstart.example2.di

import dagger.Binds
import dagger.Module
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import ru.com.bulat.dependencyinjectionstart.example2.data.datasource.TestRemoteDataSourceImpl

@Module
interface DataModule {

    @AppScope
    @Binds
    fun bindsLocalDataSource(impl : ExampleLocalDataSourceImpl) : ExampleLocalDataSource

    @ProdQualifier
    @AppScope
    @Binds
    fun bindRemoteDataSource(impl : ExampleRemoteDataSourceImpl) : ExampleRemoteDataSource

    @TestQualifier
    @AppScope
    @Binds
    fun bindTestRemoteDataSource(impl : TestRemoteDataSourceImpl) : ExampleRemoteDataSource
}