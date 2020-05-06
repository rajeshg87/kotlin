package com.rajesh.kotlin

fun main(args: Array<String>){
    for(i in 0..20 step 4){
        println(i)
    }

    val str = "My Name is Rajesh"
    str?.replace(" ", "").toUpperCase().forEach { c -> println(c) }

    for(i in 20 downTo 0 step 5){
        println(i)
    }

    val seasons = arrayOf("Spring", "Summer", "Fall", "Winter")
    seasons.forEachIndexed{
        index, s -> println("${index+1} = $s")
    }

    str?.replace(" ", "").toUpperCase().forEachIndexed{
        index, c -> println("${index+1} = $c (${c.toInt() - 64})")
    }

    for(i in 0 until 5){
        println(i)
    }
}