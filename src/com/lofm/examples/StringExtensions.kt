package com.lofm.examples

import java.io.File

fun main(args: Array<String>) {

    val file  = File("dummyfile.txt")

    //We need to write file. every time
    if (file.isAbsolute) {
        //Some code
        file.name
        file.path
        //etc
    }

    //No need to write file. everyt ime
    with(file) {
        name
        path
        //etc
    }

    val someString : String? = "Some random value"
    someString?.let {
        someString.length
        someString.chars()
        //etc
    }

}