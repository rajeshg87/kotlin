package com.rajesh.kotlin

fun main(args: Array<String>){
    val carMap = hashMapOf<Int, MCar>(1 to MCar("Honda", "Black", 2014),
    2 to MCar("Honda", "Gray", 2015),
    3 to MCar("Toyota", "Red", 2014),
    4 to MCar("Toyota", "Black", 2015),
    5 to MCar("Ford", "Gray", 2020))

    val carList = carMap.filter { it.value.color == "Black" }
        .map { it.value.name.toUpperCase() }
        .toList()

    println(carList)
}

data class MCar(val name: String, val color: String, val year: Int){}