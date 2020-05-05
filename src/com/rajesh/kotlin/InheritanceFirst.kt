package com.rajesh.kotlin

fun main(args: Array<String>){
    val printer = InkJetPrinter("HP Desktop", 12.23)
}

abstract class Printer(val modelName: String){
    open fun printModelName() = println("The name of the Printer is $modelName")
    abstract fun printerPrice(price: Double)
}

class InkJetPrinter(modelName: String, val price: Double): Printer(modelName){
    override  fun printModelName() = println("The name of the InkJet Printer is $modelName")
    override fun printerPrice(price: Double) = println("Printer Price = $price")

}