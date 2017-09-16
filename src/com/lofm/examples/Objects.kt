package com.lofm.examples

object Global {
    val PI = 3.14
}

fun main(args: Array<String>) {
    println(Global.PI)

    val localObject = object {
        val PI = 3.1416
    }

    println(localObject.PI)
}