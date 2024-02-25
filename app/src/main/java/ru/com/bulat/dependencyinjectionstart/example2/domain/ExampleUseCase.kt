package ru.com.bulat.dependencyinjectionstart.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}
