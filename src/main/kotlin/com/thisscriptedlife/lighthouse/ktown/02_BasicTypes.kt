package com.thisscriptedlife.lighthouse.ktown


fun main(args: Array<String>) {


    val myNumber = Int      // Int is an object

    val myLongThatIsAnInt = 10         // this will resolve to an Int ---> Kotlin cannot distinguish between an Int and a Long

    val myLong = 10L
    val myFloat = 10F
    val myHex = 0x0F
    val myBinary = 0xb01

    // there is no explicit conversion
    val myInt = 100
    val myLongAgain = myInt // this will resolve to int b/c of no explicit conversion

    // Instead, to achieve this via shorthand
    val myLongOnceAgain = myInt.toLong()


    // String

    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new line \n"

    val rawString = "Hello" +
            "This is the second line" +
            "This is the third line"

    val multiLineString = """
This is a string
This is another line
This is the third line
"""

    // String interpolation

    val years = 10
    val message = "A decade is $years years"


    // String interpolation with methods:

    val name = "Mary"
    val newMessage = "Length of name is ${name.length}"


}