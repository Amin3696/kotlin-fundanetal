package kotlinFundamentals

fun main() {
    /*    val range = 1..100
        for (i in range) {
            println("$i")
        }

        //reverse range
        val reverseRange = 10 downTo 1
        for (i in reverseRange) {
            println("reverse range: $i")
        }

        for (i in reverseRange step 2) {
            println("reverse range with skip : $i")
        }*/

    exporeWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i=0
    do {
        println("i value is: $i")
        i++
    }
    while (i<6)
}

fun exporeWhile() {
    var x = 1
    while (x < 5) {
        println("value of x is: $x")
        x++
    }
}
