package com.lofm.examples

fun main(args: Array<String>) {
    val message: String = "A message"   //Si se asigna null no permite compilar
    var nullMessage: String? = null //La interrogacion permite valores null
    val inferredNull = null  //Sin tipo de dato ni interrogacion

    /*
    println(message.length)
    if (nullMessage != null) {  //Se necesita la validacion para poder correr el programa
        println(nullMessage.length) //Error porque el valor podria ser null
    }
    */

    nullMessage = "Some Value"
    println(nullMessage.length)
    //println(nullMessage!!.length)

    /*
    val customerJava = CustomerJava()
    if (customerJava != null) {
        if (customerJava.name != null) {
            println(customerJava.name.length)
        }
    }
    */


}