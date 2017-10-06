package com.lofm.examples

interface CustomerRepository {
    val isEmpty: Boolean
        get() = true
    fun store(obj: Customer) {
        // Implement code to store
    }
    fun getById(id: Int): Customer
}

interface EmployeeRepository {
    val isEmpty: Boolean
        get() = true
    fun store(obj: Employee) {
        // Implement code to store
    }
    fun getById(id: Int): Employee
}

class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer()
    }
    override fun store(obj: Customer) {
        // logging
        super.store(obj)
    }
    override val isEmpty: Boolean
        get() = false
}
