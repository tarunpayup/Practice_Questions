package com.my_android_world.practice_questions

data class Book(var title: String? = null, var author: String = "", var price: Double = 0.0)

fun setupBook(): Book {
    return Book().apply {
        title = "Kotlin Mastery"
        author = "Tarun Bansal"
        price = 499.99
    }.also {
        println("Book created: ${it.title} by ${it.author}")
    }
}

fun main(){
    setupBook()
}