package com.lofm.examples

fun main(args: Array<String>) {
    var streetNumber = 10
    var streetName = "High Street"

    val zip = "E11 P1"

    val myLong = 10L
    val myFloat = 10F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLongAgan: Long = myInt.toLong()

    //String

    val myChar = 'A'
    val myString = "This is a string"

    val escapeCharacters = "This is a new line \n"

    val rawString = "This is line one " +
            "this is line two " +
            "and this is line 3"

    val multiLine = """
        THis text can be written
        in multiple lines
        due to the triple quote at the begining
        an at the end"""

    val name = "Omar"
    val message = "Hello $name"

    val anotherName = "Mary"
    val anotherMessage = "The lenght of the name is ${anotherName.length}"

}