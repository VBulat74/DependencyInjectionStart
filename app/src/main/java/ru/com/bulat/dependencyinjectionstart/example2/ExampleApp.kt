package ru.com.bulat.dependencyinjectionstart.example2

import android.app.Application
import ru.com.bulat.dependencyinjectionstart.example2.di.DaggerAppComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerAppComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}