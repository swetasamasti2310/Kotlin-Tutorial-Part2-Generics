package com.sweta

import com.sun.tools.javac.jvm.Items

fun main(args: Array<String>) {
    val names = listOf("Sweta", "Kumari")

    printType(names)    // works without exception
    printType(listOf(2))    // throws exception
}

fun printType (items: List<Any>) {
    val stuff = items as List<String> // warning of unchecked cast

    stuff.filter { s -> s == "" }
}