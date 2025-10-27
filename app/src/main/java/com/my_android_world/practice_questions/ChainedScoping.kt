package com.my_android_world.practice_questions

data class User(var username: String, var email: String, var isActive: Boolean)

fun processUser(): String {
    return User("tarun_b", "tarun@gmail.com", true).apply {
        username = username.trim()
        email = email.lowercase()
    }.also {
        println("User created: $it")
    }.let {
        if (it.email.contains("@")) it else null
    }?.run {
        if (isActive) "Welcome, $username!" else "User is inactive."
    } ?: "Invalid user data."
}

fun main(){
    processUser()
}