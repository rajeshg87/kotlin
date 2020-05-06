package com.rajesh.kotlin

fun main(args: Array<String>){

    val nums = setOf<Int>(1,2,3,3,4,4)
    println(nums)
    println(nums.average())
    nums.plus(5)
    println(nums)

    val mutableNums = mutableSetOf<Int>(1,2,3,4)
    mutableNums.plus(5)
    println(mutableNums)
    println(mutableNums.drop(2).average())


}