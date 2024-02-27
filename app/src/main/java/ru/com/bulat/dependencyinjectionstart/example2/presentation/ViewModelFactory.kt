package ru.com.bulat.dependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.com.bulat.dependencyinjectionstart.example2.di.AppScope
import javax.inject.Inject
import javax.inject.Provider

@AppScope
class ViewModelFactory @Inject constructor(
    private val viewModelProviders : @JvmSuppressWildcards Map <String, Provider <ViewModel>>
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass.simpleName]?.get() as T
    }
}