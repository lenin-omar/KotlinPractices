package com.lofm.examples

import java.io.IOException

data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    @JvmField val someField = "Some Field"

    override fun toString(): String {
        return return "{\"id\": \"$id\", \"name\": \"$name\"}"
    }

    @JvmOverloads fun changeStatus(status: Status = Status.Current) {
        //Do something
    }

    @JvmName("preferential") fun makePrefered() {
        //Do something
    }

    @Throws(IOException::class) fun loadStatistics(fileName: String) {
        if (fileName == "") {
            throw IOException("filename can not be blank")
        }
    }
}

fun CustomerKotlin.entendedFunction() {
    //Do something
}

enum class Status {
    Current,
    Past
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