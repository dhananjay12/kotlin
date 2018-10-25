package com.mynotes.datatypes


fun main(args: Array<String>) {

    val name = arrayOf("max","jane","john")

    val myLong1 = arrayOf(1L,2L,3L)

    val myLong2 = arrayOf<Long>(1,2,3)

    val evenNumbers = Array(16){i -> i*2}

    for (num in evenNumbers){
        println(num)
    }

    val mixedArray = arrayOf("Test",12,334.23)

    val myIntArr = arrayOf(1,2,3,4,5)

    //TestClass().print(mixedArray) //wont compile

    val myIntArr1 = arrayOf(1,2,3,4,5)

    //TestClass().print(mixedArray) //wont compile





}