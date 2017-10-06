package com.lofm.examples

//Constante global
val CopyrightAuthor = "Lenin Omar Flores Martinez"

object Copyright {
    //Constante local del objeto
    val author = "Omar Flores"
}

fun main(args: Array<String>) {
    println("Constante global: $CopyrightAuthor")
    println("Constante local: ${Copyright.author}")
}