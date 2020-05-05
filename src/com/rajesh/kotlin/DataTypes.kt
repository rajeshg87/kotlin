package com.rajesh.kotlin

import java.math.BigDecimal

fun main(args: Array<String>){
    val int_i: Int = 10
    var long_i = int_i.toLong()
    println(long_i is Long)

    val evenNumbers = Array(10){i -> i*2 }
    println(evenNumbers)
    evenNumbers.forEach { number -> println(number) }

    val mixedArray = arrayOf(10, 200L, 10.25, "Rajesh", 'A', BigDecimal(1234.98))
    mixedArray.forEach { value -> println(value) }
}
