package com.rajesh.kotlin

import java.lang.Exception
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main(args: Array<String>){
    println(convertNumber("20a") ?: throw CustomException("Given value is not in Number Format"))
}

class CustomException(message: String) : Exception(message){

}

fun convertNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    }catch (e: NumberFormatException){
        null
    }
    finally {
        println("I will always execute")
    }
}