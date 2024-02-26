package ru.com.bulat.dependencyinjectionstart.example2.data.datasource

import ru.com.bulat.dependencyinjectionstart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}
