package com.rajesh.kotlin

import java.lang.StringBuilder

fun main(args: Array<String>){
    val employees = listOf<LEmployee>(
        LEmployee("Rajesh","G", 2010),
        LEmployee("Lenin","G", 2000),
        LEmployee("Aravind","G", 2008),
        LEmployee("Vasanth","G", 2004)
    )

    println(employees.minBy { it.firstName })

    run(::topLevel)
    println("================with=================")
    println(countTo100UsingWith())

    println("================apply=================")
    println(countTo100UsingApply())
}

fun topLevel() = println("Top Level Function")

fun countTo100UsingWith() = with(StringBuilder()){
    for (i in 0..99){
        append(i)
        append(", ")
    }
    append(100)
    toString()
}

fun countTo100UsingApply() = StringBuilder().apply {
    for (i in 0..99){
        append(i)
        append(", ")
    }
    append(100)
}.toString()

data class LEmployee(val firstName: String, val lastName: String, val startYear: Int){}