fun main() {
    val number = 15

    val result = if (number > 0) {
        "Positive"
    } else if (number < 0) {
        "Negative"
    } else {
        "Zero"
    }

    println("The number is $result")
}
