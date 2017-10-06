package com.lofm.examples

fun String.hello() {
    println("Hello there!")
}

fun String.toTitleCase(prefix: String): String {
    return prefix + this.split(" ").joinToString(" ") { it.capitalize() }    //this
}

class Hooman {
    fun makePrefered() {
        println("Hooman version")
    }
}

fun Hooman.makePrefered() {
    println("Extended version")
}

open class BaseClass
class InheritedClass: BaseClass()

fun BaseClass.extension() {
    println("Base extension")
}

fun InheritedClass.extension() {
    println("Inherited extension")
}

fun main(args: Array<String>) {
    /*"hello".hello()
    println("this is a sample line to capitalize".toTitleCase("Again - "))
    val hooman = Hooman()
    hooman.makePrefered()*/
    val instance:BaseClass = InheritedClass()
    instance.extension()
    val anotherInstance = InheritedClass()
    anotherInstance.extension()
}