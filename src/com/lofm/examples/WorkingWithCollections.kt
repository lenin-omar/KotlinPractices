package com.lofm.examples

import java.util.*

fun main(args: Array<String>) {
    val numbers = 1..100
    val cities = listOf("Madrid", "Toronto", "Guadalajara")
    println(cities.javaClass)
    val empty = emptyList<String>()
    println(empty.javaClass)
    val arrayList = Arrays.asList("Madrid", "Toronto", "Guadalajara")
    println(arrayList.javaClass)
    val mutableCities = mutableListOf("Mexico")
    println(mutableCities.size)
    mutableCities.add("Torreon")
    println(mutableCities.size)
    val hashMap = hashMapOf(Pair("Spain", "Madrid"), Pair("France", "Paris"))
    val chars = charArrayOf('A', 'B', 'C')
    val booleans = booleanArrayOf(true, false, true, true)
}