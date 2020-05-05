package com.rajesh.kotlin

fun main(args: Array<String>){
    val str = "rajesh"
    println(str.upperFirstAndLast())

    println(multiply(16,12))
}

fun String.upperFirstAndLast(): String{
    val upperFirst = substring(0,1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

inline fun multiply(num1: Int, num2: Int) = "${num1 * num2}"