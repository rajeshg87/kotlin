package com.rajesh.kotlin

import java.time.Year

fun main(args: Array<String>){
    println(CompanyCommunication.currentYear)
    println(CompanyCommunication.getTagLine())
    println(CompanyCommunication.copyRights())
    println(CompanionClass.printPrivateVariable())
}

object CompanyCommunication {
    val currentYear = Year.now().value
    fun getTagLine() = "Our Company Rocks"
    fun copyRights() = "Copyright \u00A9 $currentYear Our Comapny. All rights reserved"
}

class CompanionClass{
    companion object{
        private val privateVar = 12345

        fun printPrivateVariable() = println("My Private Variable value is $privateVar")
    }
}