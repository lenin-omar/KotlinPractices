package com.lofm.examples



fun main(args: Array<String>) {
    var  myString = "Some random text"

    var result = if (myString != "") {
        "Not empty"
        20
    } else {
        "Empty"
    }

    println(result)

    println()

    var anotherString = "String to test"

    var resultWhen = when(anotherString) {
        is String -> {
            println("Checking the data type")
            "Returning from first when"
        }
        "String to test" -> {
            println("It matches the string expected")
            println("Just printing one more line")
            "Returning from second when"
        }
        else -> {
            println("Else block")
            "Returning from else"
        }
    }

    println(resultWhen)
}