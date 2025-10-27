package com.my_android_world.practice_questions


fun logListOperations(): List<Int> {
    val list = mutableListOf<Int>()
    list.also { println("Initial: $it") }
        .add(10)
    list.also { println("After adding 10: $it") }
        .add(20)
    return list
}

fun main(){
    println(logListOperations())
}