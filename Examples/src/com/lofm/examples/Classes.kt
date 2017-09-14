package com.lofm.examples

import java.util.*

class Customer(val id:Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security number should start with SN")
            }
            field = value
        }

    fun customerAsString(): String {
        return "id: $id, name: $name, age: $age"
    }
}

fun main(args: Array<String>) {
    val customer = Customer(13, "Omar", 1983)
    customer.socialSecurityNumber = "SN12312121234"
    println(customer.id)
    println(customer.name)
    println(customer.age)
    println(customer.customerAsString())
}