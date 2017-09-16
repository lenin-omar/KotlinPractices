package com.lofm.examples

fun hello(): Unit {
    println("Hello")
}

fun throwingExceptions(): Nothing {
    throw Exception("This function throws an exception")
}

fun returnAFour(): Int {
    return 4
}

fun takinString(name: String) {
    println(name)
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun sum2(x: Int, y: Int, z: Int = 0) = x + y + z

fun printDetails(name: String, email: String = "", phone: String) {
    println("name $name - email $email - phone $phone")
}

fun printStrings(vararg strings: String) {
    reallyPrinting(*strings)
}

private fun reallyPrinting(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>) {
    hello()
    //throwingExceptions()
    val myNumber = returnAFour()
    println(myNumber)
    takinString("Omar")
    val sumNumber = sum(4, 5)
    println(sumNumber)
    println(sum2(3, 4))
    printDetails("Omar", phone = "555 123 1234")
    printStrings("1")
    printStrings("1", "2")
    printStrings("1", "2", "3")
    printStrings("1", "2", "3", "4")
}