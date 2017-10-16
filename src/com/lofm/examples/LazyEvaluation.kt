package com.lofm.examples

fun main(args: Array<String>) {
    //Wrong way to do it. It's going to evaluate every element and it takes much time
    /*val elements = 1..1000000000000000000
    val output = elements.asSequence().filter { it < 30 }.map { Pair("Number: ", it) }
    output.forEach {
        println(it)
    }

    val output = elements.asSequence().take(30)
    output.forEach {
        println(it)
    }

    val seq = generateSequence(0) {
        //There could be more than one simply instruction here
        it + 10
    }.take(30)
    seq.forEach {
        println(it)
    }*/

    val lazyInit: Int by lazy { 10 }
}