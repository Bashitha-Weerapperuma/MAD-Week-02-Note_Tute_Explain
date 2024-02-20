fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)

    println("Printing numbers using for loop:")
    for (number in numbers) {
        println(number)
    }

    println("\nPrinting numbers in reverse order:")
    for (i in numbers.size - 1 downTo 0) {
        println(numbers[i])
    }

    println("\nPrinting even numbers only:")
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}
