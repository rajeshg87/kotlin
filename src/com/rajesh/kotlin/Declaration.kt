package com.rajesh.kotlin

typealias UserSet = Set<User>

fun main(args: Array<String>){
    val number: Int
    var name: String
    number = 10
    name = "Rajesh"
    name = "Kannan"
    println(String.format("Name : %s Number : %s",name, number))

    val names = arrayListOf("Rajesh", "Lenin", "Aravind", "Vasanth")
    println(names)

    val user1 = User("Rajesh", 100)
    val user2 = User("Lenin", 200)
    val user3 = User("Lenin", 200)

    println(user1 == user2)
    println(user2 == user3)
    println(user2 === user3)

    println(user1)

}

class User(var name: String, val id: Int){

    override fun equals(obj: Any?): Boolean {
        if(obj is User){
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "name=$name, id=$id"
    }
}