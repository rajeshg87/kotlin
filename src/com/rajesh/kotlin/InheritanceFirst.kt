package com.rajesh.kotlin

fun main(args: Array<String>){
    val printer = InkJetPrinter("HP Desktop", 30.50)
    printer.printerPrice();
}

abstract class Printer(val modelName: String){
    open fun printModelName() = println("The name of the Printer is $modelName")
    abstract fun printerPrice()
}

class InkJetPrinter(modelName: String, val price: Double): Printer(modelName){
    override  fun printModelName() = println("The name of the InkJet Printer is $modelName")
    override fun printerPrice() = println("Printer Price = $price")

}