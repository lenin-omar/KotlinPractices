package com.lofm.examples

open class Persona {

}

class Empleado: Persona() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Persona() {

}

fun hasVacations(obj: Persona) {
    if (obj is Empleado) {
        obj.vacationDays(20)  //obj de tipo Empleado
    } else {
        //obj solo tiene funciones propias de Persona
    }
}

var input: Any = 10

fun main(args: Array<String>) {
    val str = input as? String  //Safe cast
    println(str?.length)    //Safe cast
}