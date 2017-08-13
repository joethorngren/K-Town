package com.thisscriptedlife.lighthouse.ktown


fun main(args: Array<String>) {



    // .. short-hand operator overload for rangeTo
    for (a: Int in 1..100) {
        println(a)
    }

    // inferred type
    for(a in 1..100) {
        println(a)
    }

    // can use the .. short-hand to initialize variables

    val numbers = 1..100

    for (a in numbers) {
        println(a)
    }

    // can also count down via

    for (a in 100 downTo 1) {
        println(a)
    }

    // or

    for (a in 100..1) {
        println(a)
    }

    // can also use step value

    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    val capitals = listOf("London", "Paris", "Rome", "Madrid")

    for (capital in capitals) {
        println(capital)
    }

    // Loops

    // while

    var i = 100
    while (i > 0) {
        i--
    }

    // do-while

    do {
        var x = 10
        x--
    } while (x > 10)


    // break + continue statements

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j % i == 0) {
                break@loop
                // this is a label
            }
        }
    }
}