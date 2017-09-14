package com.lofm.examples

data class CustomerKotlin(var id: Int, var name: String, var email: String)

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(13, "Omar", "dont.write@fakemail.com")
    val customer2 = CustomerKotlin(13, "Omar", "dont.write@fakemail.com")

    println(customer1)
}