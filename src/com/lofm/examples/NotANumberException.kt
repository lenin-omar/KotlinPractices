package com.lofm.examples

class NotANumberException(message: String) : Throwable(message) { }

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}

fun main(args: Array<String>) {
    val result = try {
        checkIsNumber("A")
        -1
    } catch (e: IllegalArgumentException) {
        println("Do nothing")
        -2
    } catch (e: NotANumberException) {
        println("${e.message}")
        -3
    } finally {
        println("Closing")
        -4  //NO se asigna este valor al result
    }
    println(result)
}