package ru.com.bulat.dependencyinjectionstart.example1

class Activity {

    lateinit var computer : Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }


}