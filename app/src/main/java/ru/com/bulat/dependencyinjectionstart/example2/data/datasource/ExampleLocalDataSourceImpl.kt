package ru.com.bulat.dependencyinjectionstart.example2.data.datasource

import ru.com.bulat.dependencyinjectionstart.example2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
