package kotlinFundamentals

fun main() {
    //if-else
    var name = "AminSh"

    val result = if (name.length == 4) {
        println("name length is ${name.length} characters")
        name.length
    } else {
        println("name length is not 4 chaarcters")
        name.length
    }
    println("result : $result")


    //1-->Gold, 2-->Silver, 3--> Bronze

    var position = 1

    val resultMedal = if (position == 1) {
        "Gold"
    } else if (position == 2) {
        "Silver"
    } else if (position == 3) {
        "Bronze"
    } else
        "no Medal"
    println("result medal : $resultMedal")

    var position2 = 3
    val resultMedal2 = when (position2) {
        1 -> "Gold"
        2 -> "Silver"
        3 -> "Bronze"
        else -> "no Medal"
    }
    println("result medal : $resultMedal2")
}