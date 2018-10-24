package com.mynotes.getting.started

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employees: EmployeeSet

    val num: Short = 25

    var number: Short = 25

    number = 20

    val emp1 = Employee("Jane Doe", 1)
    emp1.name = "Jane Doe1"

    val names = arrayListOf("Jane", "John", "Mary")
    println(names[1])

    val filePath= "c:\\test\\abc"

    val filePath2= """c:\test\abc"""

    var multiline = """test qwerty
        |test qwerty
        |zxc
    """.trimMargin()

    println(multiline);


    var multiline1 = """test qwerty
        *test qwerty
        *zxc
    """.trimMargin("*")

    println(multiline1);

    val hello1 = "Hello"
    val hello2 = "Hello"

    //String Pool same as java
    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello2 is structurally equal to hello2: ${hello1 == hello2}")
}

class Employee(var name: String, val id: Int) {

}
