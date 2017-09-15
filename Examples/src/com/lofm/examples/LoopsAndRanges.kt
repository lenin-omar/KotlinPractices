package com.lofm.examples

fun main(args: Array<String>) {
    for (a in 1..10) {
        println(a)
    }

    println()

    for (a in 90 downTo 70) {
        println(a)
    }

    println()

    for (a in 50 downTo 40 step 2) {
        println(a)
    }

    println()

    val numbers = 0..30

    for (a in numbers step 3) {
        println(a)
    }

    println()

    val capitals = listOf("Rome", "Paris", "Madrid", "London")

    for (capital in capitals) {
        println(capital)
    }

    println()

    loop@ for (i in 1..20) {
        println(".....i: $i")
        for (j in 1..20) {
            println(".....j: $j")
            if (j % i == 0) {
                break@loop
            }
        }
    }

    println()

    for (i in 1..20) {
        println(".....i: $i")
        for (j in 1..20) {
            println(".....j: $j")
            if (j % i == 0) {
                break
            }
        }
    }

}