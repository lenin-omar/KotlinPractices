package com.lofm.examples

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 23000000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 23000000)
}

fun main(args: Array<String>) {
    val result = capitalAndPopulation("Spain")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Spain")
    println(countryInfo.first)
    println(countryInfo.second)
    println(countryInfo.third)

    println(countryInfo.component1())
    println(countryInfo.component2())
    println(countryInfo.component3())

    val (capital, continent, population) = countryInformation("Spain")
    println(capital)
    println(continent)
    println(population)

    val (id, name, email) = CustomerKotlin(1, "Omar", "a@b.com")
    println(id)
    println(name)
    println(email)

    val listCapitalCountries = listOf(Pair("Madrid", "Spain"), Pair("Paris", "France"))
    for ((capital, country) in listCapitalCountries) {
        println("$capital - $country")
    }
}