package com.rajesh.kotlin

fun main(args: Array<String>){
    val str: String? = null
    println(str?.toUpperCase())

    var str2: String = str?: "Null Value"
    println(str2?.toUpperCase())

    val str4: String ?= "This is not NULL"
    str4?.let { println(it) }

    //var str3: String = str!!.toUpperCase()
    //println(str3)

    val names = arrayOfNulls<String?>(3)
    println(names[1])

}