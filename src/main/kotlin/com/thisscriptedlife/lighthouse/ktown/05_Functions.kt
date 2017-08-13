package com.thisscriptedlife.lighthouse.ktown


// No need to be inside a class
// Because we're not specifying a return value (i.e., void), this function will return the default kotlin.Unit
fun hello() {
    println("Hello!")
}

// This is equivalent to:
fun helloWithReturnType(): Unit {
    println("Hello!")
}

// Use 'nothing' to represent a value that never exists
fun throwsException(): Nothing {
    throw Exception("This function throws an exception")
}

// Function with return value
fun returnsFour(): Int {
    return 4
}

// No longer current? type inference is also used for function return values, so we could re-write returnsFour as:
//fun returnsFourTypeInference() {
//    return 4
//}

// Single expression functions:
// When a function only has a single expression, instead of writing out the function body, i.e.,
fun sum(x: Int, y: Int): Int {
    return x + y
}

// We can eliminate the function body and just write
fun sumSingleExpression(x: Int, y: Int): Int = x + y


fun main(args: Array<String>) {
    hello()
}