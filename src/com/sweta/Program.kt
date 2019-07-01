package com.sweta

fun main(args: Array<String>) {
    var names = listOf("Sweta", "Kumari")   // type is inferred here

    val name = names.itemAt(0)

    println(name)

    val n:Node<Int> = Node(2)

    println(n.value())
}

fun<T> List<T>.itemAt(ndx: Int): T {
    return this[ndx]
}

/*
class Node<T>(private val item: T) {
    fun value(): T {
        return item
    }
}*/

// constrained type parameter. In the following example, constrain is T must be Number or type derived from Number
class Node<T: Number>(private val item: T) {
    fun value(): T {
        return item
    }
}

inline fun <reified T> foo(value: Any) = value is T