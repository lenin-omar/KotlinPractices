package com.lofm.examples

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status(): String {
        return isActive.toString()
    }
}

class Employee: StoredEntity() {
    override fun store() {
        //Necesita ser implementado
    }
}

fun main(args: Array<String>) {
    val se = Employee()
    se.isActive
    println(se.status())
}