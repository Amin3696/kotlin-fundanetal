package kotlinFundamentals

fun main() {
    val range = 1..100
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
    }

}