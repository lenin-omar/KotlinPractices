package com.lofm.examples

fun main(args: Array<String>) {
    val customer = CustomerJava()
    //No need of getters and setters
    customer.email = "another.email@whatever.com"
    println(customer.email)
    customer.prettyPrint()  //Return type = Unit because is Java void
    val runnable = Runnable { println("Invoking runnable") }
    runnable.run()
}

class PersonKotlin: PersonJava() {
    override fun javaMethod() {
        super.javaMethod()
    }
}

class KotlinCustomerImplementation: CustomerInterface {
    override fun getById(id: Int): CustomerJava {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): MutableList<CustomerJava> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}