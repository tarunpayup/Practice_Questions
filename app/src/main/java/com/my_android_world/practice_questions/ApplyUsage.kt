package com.my_android_world.practice_questions

data class Person(var name: String = "", var age: Int = 0, var city: String = "")

fun createPerson(): Person {
    return Person().apply {
        name = "Tarun"
        age = 25
        city = "Delhi"
    }
}

fun main(){
    println(createPerson())
}