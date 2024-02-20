// Define a generic function called `printList`
fun <T> printList(list: List<T>) {
    for (item in list) { // Iterate over each item in the list
        println(item) // Print each item
    }
}

fun main() {
    // Create a list of integers
    val intList = listOf(1, 2, 3, 4, 5)
    // Call the generic function `printList` with the integer list
    printList(intList)

    // Create a list of strings
    val stringList = listOf("Apple", "Banana", "Orange")
    // Call the generic function `printList` with the string list
    printList(stringList)
}
