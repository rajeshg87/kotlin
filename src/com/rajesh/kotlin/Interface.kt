package com.rajesh.kotlin

fun main(args: Array<String>){
    val myClass = MyClass()
    println(myClass.myInterfaceFunc())
    println(myClass.mySubInterfaceFunc())
    println(myClass.myChildInterfaceFunc())
}

class MyClass:MyInterface, MySubInterface, MyChildInterface{
    override fun myChildInterfaceFunc(): String = "My Child Interface"
    override fun myInterfaceFunc(): String = "My Interface"
    override fun mySubInterfaceFunc(): String = "My SubInterface"

}

interface MyInterface{
    fun myInterfaceFunc():String
}

interface MySubInterface{
    fun mySubInterfaceFunc():String
}

interface MyChildInterface: MyInterface{
    fun myChildInterfaceFunc(): String
}