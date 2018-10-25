package com.mynotes.datatypes

fun main(args: Array<String>) {

    val str :String? =null

    val str1 :String? ="test"

    if(str1 !=null) {
        println(str1.toUpperCase())
    }

    println(str1?.toLowerCase())

}