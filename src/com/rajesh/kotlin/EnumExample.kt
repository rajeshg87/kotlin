package com.rajesh.kotlin

fun main(args: Array<String>){
    Department.values().forEach { dept -> println(dept.getDeptInfo()) }

}

enum class Department(val fullName: String, val noOfEmployees: Int) {
    HR("Human Resources", 20),
    IT("Information Technology", 50),
    ACCT("Accounting", 10),
    SALES("Sales", 10);

    fun getDeptInfo() = "The $fullName department has $noOfEmployees employees"

}