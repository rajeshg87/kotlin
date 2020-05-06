package com.rajesh.kotlin

fun main(args: Array<String>){

    val seasons = listOf<String>("Spring", "Summer", "Winter", "Fall", "Summer")
    val colors = listOf<String>("Blue", "Black", "White", "Red")

    println(colors.asReversed())

    println(seasons.getOrNull(5))

    val zipList = seasons.zip(colors)
    println(zipList)

    val noDupMergeList = seasons.union(colors)
    println(noDupMergeList)

    val noDupSeasons = seasons.distinct()
    println(noDupSeasons)

}