@file:JvmName("UtilityClass")
package com.lofm.examples

const val CopyrightYear = 2017
fun prefix(prefix: String, value: String): String {
    return "$prefix - $value"
}