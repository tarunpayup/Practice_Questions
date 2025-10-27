package com.my_android_world.practice_questions


fun printNameIfNotNull(name: String?): String {
    return name?.let { "Name is: $it" } ?: "Name is null"
}
fun main(){
    println(printNameIfNotNull("Tarun"))
}