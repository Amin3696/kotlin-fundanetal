package kotlinFundamentals

fun main() {
    exploreBreak()
    exploreLable()
    exploreReturn()
    println("end of program!")
}

fun exploreReturn() {
    for (i in 1..5) {
        println("i in return is $i")
        if (i == 3) return
    }
    // difference of break and return: break terminate the loop and return terminates the function
    println("End of third part!")
}

fun exploreBreak() {
    for (i in 1..5) {
        println("i is $i")
        if (i == 3) break
    }
    println("End of first part!")
}

fun exploreLable() {
    loop@ for (i in 1..5) {
        println("i is $i")
        innerLoop@ for (j in 1..5) {
            println("j is $j")
            // if (j == 2) break@innerLoop
            if (j == 2) continue@loop
        }
    }
    println("End of second part!")
}

