package com.my_android_world.practice_questions

fun processList(numbers: List<Int>): List<Int> {
    return with(numbers) {
        sorted().filter { it > 5 }
    }
}

fun main(){
    println(processList(listOf(1, 2, 3, 4, 5, 6, 7, 8)))
}