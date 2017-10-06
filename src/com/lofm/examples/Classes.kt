package com.lofm.examples

import java.util.*

class CustomerExample(val id: Int, var name: String = "", val yearOfBirth: Int){
    /*init {
        name = name.toUpperCase()
    }

    constructor(email: String): this(0, "", 2000) {
        println(email)
    }*/

    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
    //La misma linea de arriba se puede hacer de la siguiente manera
    /*get() {
        return Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth
    }*/

    var socialSecurityNumber: String = ""
         set(ssnValue) {
            if (!ssnValue.startsWith("SN")) {
                throw IllegalArgumentException("Social security number should start with SN")
            }
            field = ssnValue
        }

}

fun main(args: Array<String>) {
    val customer = CustomerExample(13, "Omar", 1983)
    //La siguiente línea asigna el valor a ssnValue y la función set asigna el valor de ssnValue al field de socialSecurityNumber
    customer.socialSecurityNumber = "SN12346789"
    /*val customer2 = Customer(13, yearOfBirth = 1983)
    val customer3 = Customer(email = "dont.write@fakemail.com")*/
    println(customer.id)
    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)
}