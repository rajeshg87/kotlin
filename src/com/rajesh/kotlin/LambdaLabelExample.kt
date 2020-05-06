package com.rajesh.kotlin

fun main(args: Array<String>){

    "Some String".apply something@{
        "Another String".apply {
            println(toLowerCase())
            println(this@something.toUpperCase())
        }
    }

    val mutableList = mutableListOf<Int>(1,2,3,4,5)
    mutableList.set(2, 20)
    println(mutableList)

    val immutableList = listOf<Int>(1,2,3,4,5)
    println(immutableList)
}

