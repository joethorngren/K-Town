package com.thisscriptedlife.lighthouse.ktown

fun main(args: Array<String>) {

    // syntax: name : type

    // no initialization
    var streetNumber : Int

    // initialized
    var streetName : String = "High Street"

    // use typeInference
    var streetNumberInferredType = 10
    var streetNameInferredType = "High Street"

    // var == mutable
    // val == immutable

    val zip = "E11 P1"

    streetName = "Pudding Lane"

    // zip = "New Zip" ---> compiler is pissed, "Val cannot be re-assigned"
}