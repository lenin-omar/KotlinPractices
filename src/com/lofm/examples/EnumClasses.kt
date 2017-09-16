package com.lofm.examples

enum class Priority(val value: Int) {
    MINOR(-5) {
        override fun text(): String {
            return "This is function text implementation for MINOR"
        }

        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(5) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String
}

fun main(args: Array<String>) {
    val priority = Priority.MINOR
    println(priority.text())
//    println(priority)
//    println(priority.value)
//    println(priority.name)
//    println(priority.ordinal)
//
//    println(Priority.CRITICAL)
//    println(Priority.CRITICAL.name)
//    println(Priority.CRITICAL.value)
//    println(Priority.CRITICAL.ordinal)

//    for (priorityInList in Priority.values()) {
//        println(priorityInList)
//    }

//    val p = Priority.valueOf("MAJOR")
//    println(p)
//    println(p.name)
//    println(p.value)
//    println(p.ordinal)
}