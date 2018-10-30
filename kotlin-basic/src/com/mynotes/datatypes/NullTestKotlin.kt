package com.mynotes.datatypes

fun main(args: Array<String>) {

    val str :String? =null

    val str1 :String? ="test"

    if(str1 !=null) {
        println(str1.toUpperCase())
    }

    println(str1?.toLowerCase())

    val str2: String? = null

    println("When it is null=> " + str2?.toUpperCase())

    val str3 = str2 ?: "Default Value"

    println(str3)

    val myArr: Any = arrayOf(1, 2, 3, 4)
    val str4 = myArr as? String
    println(str4)

    // not null assertion
    val str5: String? = "test"

    val str6 = str5!!.toUpperCase()
    println(str6)

    val str7: String? = null

    val str8 = str7!!.toUpperCase()
    println(str8)

    val str9: String? = null
    val someString = "Not Null"
    println(str9 == someString)

    val nullableInts = arrayOfNulls<Int?>(5)

}