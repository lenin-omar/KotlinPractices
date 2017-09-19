package com.lofm.examples

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
    val customer = customerRepo.getById(1)  //Regresa un objeto de tipo Customer
    val customers = customerRepo.getAll()   //Regresa lista de objetos Customer
}