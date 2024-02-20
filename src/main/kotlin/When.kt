fun main() {
    val number = 5

    val result = when (number) {
        1 -> "One"
        2 -> "Two"
        3, 4 -> "Three or Four"
        in 5..10 -> "Between Five and Ten"
        else -> "Other"
    }

    println("The number is $result")
}
