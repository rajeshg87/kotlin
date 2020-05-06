package com.rajesh.kotlin

fun main(args: Array<String>){

    val map = hashMapOf<Int, String>(1 to "Rajesh",
                                2 to "Lenin",
                                3 to "Aravind",
                                4 to "Vasanth"
                             )

    println(map.get(2))

    map.put(5, "Ragav")

    for((k,v) in map){
        println("$k = $v")
    }
}