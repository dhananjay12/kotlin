package com.mynotes.datatypes

import com.mynotes.javacode.TestClass

fun main(args: Array<String>) {

    val myInt = 10

    val myLong = 22L

    val myLong1 :Long = 22

    val myLong2 : Long = myInt.toLong()

    var myDouble = 23.23

    println(myDouble is Double)

    var myFloat = 12.12f

    var myChar = 'b'

    var myCharInt = 65

    println(myCharInt.toChar())

    val myBoolean = true

    val result = TestClass().test(myBoolean)
    println(result)

    val anything: Any

}