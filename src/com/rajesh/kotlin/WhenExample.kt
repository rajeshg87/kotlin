package com.rajesh.kotlin

import java.math.BigDecimal

enum class Seasons{
    SPRING, SUMMER, FALL, WINTER;
}

fun main(args: Array<String>){
    println(seasonDetail(Seasons.FALL))

    val value = true
    println(getValueType(value))

    println(compareNum(8, 10))
}

fun seasonDetail(season: Seasons) =  when(season){
    Seasons.SPRING -> "Flowers starts Blossming"
    Seasons.SUMMER -> "It's hot time to plan Vacation"
    Seasons.FALL -> "Awesome Weather I love it"
    Seasons.WINTER -> "It's cold time to wear Jacket"
}

fun getValueType(value: Any) = when(value){
    is Int -> "Integer"
    is String -> "String"
    is BigDecimal -> "Big Decimal"
    is Double -> "Double"
    is Boolean -> "Boolean"
    else -> "Invalid Input"
}

fun compareNum(num1: Int, num2: Int) = when {
    num1 > num2 -> "$num1 is greater than $num2"
    num1 < num2 -> "$num1 is less than $num2"
    else -> "$num1 is equal to $num2"
}

