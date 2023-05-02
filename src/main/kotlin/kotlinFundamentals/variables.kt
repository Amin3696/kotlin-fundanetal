package kotlinFundamentals

import kotlin.random.Random


fun main() {
    // all variables in Kotlin should be defined with val or var
    //val is immutable variable and var is mutable variable

    //in Kotlin, it is not mandatory to define the type of variable,
    // it can recognize type of variable by value (type inference)

   /* val name: String = "Amin"
    val name1 = "Ali"
    println("name is $name and name1 is $name1")

    var age: Int = 20
    println("age is $age")

    age = 22
    println("new age is $age") //using $ is String interpolation or String templates

    var salary = 3500L
    println(message = "Gross salary is $salary €,\ntaxes is ${salary * .25}€ \nnet salary is ${salary - (salary * .25)}€")

    //another way to have multiline variables is using """ operator
    val multiline = """
        Gross : $salary
        taxes : ${salary * .25}€
        net   : ${'$'}{salary-(salary*.25)

    """.trimIndent()
    println(message = multiline)

    */

    val randomNumbers = mutableSetOf<Int>()
    while (randomNumbers.size < 5) {
        randomNumbers.add((1..50).random())
    }
    println("random1-50: $randomNumbers")

    val randomNumbers2 = mutableSetOf<Int>()
    while (randomNumbers2.size < 2) {
        randomNumbers2.add((1..12).random())
    }
    println("random1-12: $randomNumbers2")
}

