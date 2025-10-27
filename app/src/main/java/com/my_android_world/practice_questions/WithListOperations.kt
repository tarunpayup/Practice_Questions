package com.my_android_world.practice_questions

fun analyzeList(numbers: List<Int>): String {
    return with(numbers) {
        val sorted = sorted()
        val filtered = sorted.filter { it % 2 == 0 }
        "Even numbers: $filtered"
    }
}

fun main(){
    println(analyzeList(listOf(1,2,3,4,5,6)))
}