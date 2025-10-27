package com.my_android_world.practice_questions

fun buildGreeting(): String {
    return StringBuilder().run {
        append("Hello, ")
        append("Tarun!")
        toString()
    }
}

fun main(){
    println(buildGreeting())
}