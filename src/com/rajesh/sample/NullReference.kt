package com.rajesh.sample

fun main(args: Array<String>){
    val str: String? = null
    println(str?.toUpperCase())

    var str2: String = str?: "Null Value"
    println(str2?.toUpperCase())
}