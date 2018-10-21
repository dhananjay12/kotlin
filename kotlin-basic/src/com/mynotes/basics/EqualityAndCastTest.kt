package com.mynotes.basics


fun main(args: Array<String>) {
    val per1=Product("Jane",1)
    val per2=Product("John",2)
    val per3=Product("John",2)

    println(per1 == per2)
    println(per2 == per3)
    println(per1.equals(per2))
    println(per2.equals(per3))

    println(per2 === per3)


    val something: Any = per1

    if(something is Product){
        val newItem = something as Product
    }

}

class Product(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if(other is Product){
            return name==other.name && id==other.id
        }
        return false
    }

    override fun toString(): String {
        return "Product(name=$name, id=$id)"
    }


}