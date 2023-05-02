package functions

import java.time.LocalDate

fun main() {
    printName("David")
    val result = addFunction(23, 2)
    println("result is: $result")

    val result2 = addFunctionNewApproach(1, 2)
    println("result2 is: $result2")

    printPersonData(name = "David", email = "david@example.com", dob = LocalDate.parse("2010-05-12"))
    printPersonData(name = "Diana")
    printPersonData(name = "Davis",dob = LocalDate.parse("2013-10-12"))
    printPersonData(dob = LocalDate.parse("2013-10-12"),name = "Davis")
}
//with default value parameters ex: email, in case of no value it will be "" and for dob be now
//default value parameters will be defined with = after param's name
fun printPersonData(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("name: $name, email: $email, dob: $dob")
}


//method
fun addFunctionNewApproach(x: Int, y: Int) = x + y

fun addFunction(x: Int, y: Int): Int {
    return x + y
}

fun printName(name: String) {
    println("name is $name")
}


