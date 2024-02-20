fun main() {
    // Arithmetic Operators
    val a = 5
    val b = 2

    val sum = a + b // summation
    val sub = a - b // subtraction
    val mul = a * b // multiplication
    val div = a / b.toFloat() // division

    println("Arithmetic Operators:")
    println("Sum: $sum")
    println("Subtraction: $sub")
    println("Multiplication: $mul")
    println("Division: $div")

    // Comparison Operators
    val val1 = 10
    val val2 = 5
    

    val isEqual = val1 == val2
    println("\nComparison Operators:")
    println("Is val1 equal to val2: $isEqual") // false

    // Logical Operators
    val t = true
    val f = false

    val andResult = t && f // AND operator
    val orResult = t || f // OR operator
    val notResult = !t // NOT operator

    println("\nLogical Operators:")
    println("AND Result: $andResult")
    println("OR Result: $orResult")
    println("NOT Result: $notResult")
}
