package com.lofm.examples

open class Person() {
    open fun validate() {
    }
}

open class Customer: Person {
    final override fun validate() {
    }

    constructor(): super() {
    }

}

class SpecialCustomer: Customer() {
    //Aqui no puede existir una funcion validate
}

data class CustomerEntity(val name: String) {

}

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()
}