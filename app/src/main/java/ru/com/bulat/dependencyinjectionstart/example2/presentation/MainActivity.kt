package ru.com.bulat.dependencyinjectionstart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectionstart.R
import ru.com.bulat.dependencyinjectionstart.example2.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        DaggerAppComponent.builder()
            .context(this)
            .timeMillis(System.currentTimeMillis())
            .build()
    }



    @Inject
    lateinit var viewModel : ExampleViewModel

    override fun onCreate(savedInstanceState : Bundle?) {

        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()
    }
}