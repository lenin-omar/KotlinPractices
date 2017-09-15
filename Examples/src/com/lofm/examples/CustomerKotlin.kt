package com.lofm.examples

data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        return return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }
}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(13, "Omar", "dont.write@fakemail.com")
//    val customer2 = CustomerKotlin(13, "Omar", "dont.write@fakemail.com")

//    if (customer1 == customer2) {
//        println("They are the same")
//    }

//    val customer3 = customer1
//    println(customer3.id)

    val customer4 = customer1.copy(name = "Lenin")
    println(customer1)
    println(customer4)
}