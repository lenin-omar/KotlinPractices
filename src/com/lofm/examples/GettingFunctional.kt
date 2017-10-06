package com.lofm.examples

fun operation(x: Int, y: Int, op:(Int, Int) -> Int): Int {
    return op(x, y)
}

fun suma(x: Int, y: Int) = x + y

fun unaryOperation(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun unaryOperation(op: (Int) -> Int): Int {
    return op(6)
}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {
        //Commit database
    }
}

fun main(args: Array<String>) {
    println(operation(1, 2, ::suma))

    println(operation(1, 2, {x, y -> x + y}))

    val someLambda: (Int, Int) -> Int = {x, y -> x + y}
    println(operation(4, 5, someLambda))


    //println(unaryoperation(2, {x -> x * x}))
    println(unaryOperation(5, {it * it}))

    println(unaryOperation(5) {it * it})

    println(unaryOperation { it * it })

    val db = Database()

    transaction(db) {
        //Several lines of code that interact with db
    }

    println(unaryOperation(4, fun(x: Int): Int {return x * x}))
}