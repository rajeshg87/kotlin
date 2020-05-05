package com.rajesh.kotlin

fun main(args: Array<String>){
    val emp1 = Employee("Rajesh", 100)
    println(emp1)

    val emp2 = Employee("Lenin", 200, true)
    println(emp2)

    val car = Car("Honda", "Civic", 2014)
    println(car)

    val car2 = Car("Honda", "Civic", 2014)
    println(car == car2)

    val car3 = car.copy(model = "Accord")
    println(car3)

    val cars = arrayOf(car, car2, car3)
    printCarModels(*cars)
}

//class Employee constructor(name: String, id: Int){
//    val name: String = name
//    val id: Int = id
//}

fun printCarModels(vararg cars: Car){
    cars.forEach { car -> println(car.model) }
}

class Employee constructor(val name: String, val id: Int){

    var fullTime:Boolean ?= null

    constructor(name: String, id: Int, fullTime: Boolean): this(name, id){
        this.fullTime = fullTime
    }

    override fun toString(): String {
        return "Employee($name, $id, $fullTime)"
    }
}

data class Car(val make: String, val model: String, val year: Int){}