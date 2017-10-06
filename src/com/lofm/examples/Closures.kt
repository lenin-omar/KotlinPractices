package com.lofm.examples

fun outsideFunction() {
    for (number in 1..30) {
        unaryOperation(20, { x ->
            println(number)
            x * number  //value captured in a closure
        })
    }
}

fun main(args: Array<String>) {
    outsideFunction()
}