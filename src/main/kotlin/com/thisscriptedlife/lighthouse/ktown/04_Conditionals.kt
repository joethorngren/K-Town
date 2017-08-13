package com.thisscriptedlife.lighthouse.ktown


fun main(args: Array<String>) {


    // if as a statement

    var myString = "Not empty"
    if (myString != "") {
        println("Not empty...")
    } else if (myString.startsWith("a")) {
        println("Starts with 'A'")
    }

    // if is an expression

    var resultUnit = if (myString != "") {
        println("Not empty...")
    } else {
        println("Is empty")
    }

    println(resultUnit)     // type of result is kotlin.Unit == void

    // Kotlin allows you to assign a value to the result of an if statement

    // the return type of the variable returned by an if expression
    // will default to the type of the last line in the if expression

    var resultString = if (myString != "") {
        "Not empty..."
    } else {
        "Is empty"
    }

    println(resultString)

    // any ---> more on this later

    var resultAny = if (myString != "") {
        println("Not empty...")
        20
    } else {
        "Is empty"
    }

    println(resultAny)


    // when == switch/case statement

    val result = "A string"

    when (result) {
        is String -> println("Result is a string")
        "Value" -> println("It's a value")
    }

    // ---> prints "Result is a string"

    when (result) {
        "Value" -> println("It's a value")
        is String -> println("Result is a string")
    }

    // ---> prints "It's a value"

    // when breaks out after a match, does not trickle down, don't need to 'break'

    // when can also be used as an expression

    val newResult = "Value"
    val whenValue = when (newResult) {
        "Value" -> {            // multiple statements inside when
            println("It's a value")
            println("Second statement")
        }
        is String -> println("It's a string")
        else -> println("It came to this")
    }

    println(whenValue)      // same drill, will return kotlin.Unit
}