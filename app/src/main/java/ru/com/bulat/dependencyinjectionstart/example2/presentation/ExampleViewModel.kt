package ru.com.bulat.dependencyinjectionstart.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import ru.com.bulat.dependencyinjectionstart.example2.domain.ExampleUseCase
import ru.com.bulat.dependencyinjectionstart.example2.domain.IdQualifier
import ru.com.bulat.dependencyinjectionstart.example2.domain.NameQualifier
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name : String,
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this id: $id name: $name")
    }
}
