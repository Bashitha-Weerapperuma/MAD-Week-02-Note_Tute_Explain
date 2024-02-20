fun main() {
    // List example
    val numbersList = listOf(1, 2, 3, 4, 5) // Create an immutable list of integers
    println("List example:")
    println("Size of the list: ${numbersList.size}") // Print the size of the list
    println("First element: ${numbersList.first()}") // Print the first element of the list
    println("Last element: ${numbersList.last()}") // Print the last element of the list
    println("Element at index 2: ${numbersList[2]}") // Print the element at index 2
    println("Is 6 present in the list? ${numbersList.contains(6)}") // Check if 6 is present in the list
    println("Is 3 present in the list? ${numbersList.contains(3)}") // Check if 3 is present in the list
    println()

    // Set example
    val uniqueNumbersSet = setOf(1, 2, 3, 4, 5, 5) // Create an immutable set of unique integers
    println("Set example:")
    println("Size of the set: ${uniqueNumbersSet.size}") // Print the size of the set
    println("Is 5 present in the set? ${uniqueNumbersSet.contains(5)}") // Check if 5 is present in the set
    println("Is 6 present in the set? ${uniqueNumbersSet.contains(6)}") // Check if 6 is present in the set
    println()

    // Map example
    val userMap = mapOf(
        "Bashitha" to 25,
        "Bashitha_01" to 30,
        "Bashitha_02" to 28
    ) // Create an immutable map of user names to their ages
    println("Map example:")
    println("Size of the map: ${userMap.size}") // Print the size of the map
    println("Age of Bashitha: ${userMap["Bashitha"]}") // Print the age of John
    println("Age of Bashitha_01: ${userMap["Bashitha_01"]}") // Print the age of Alice
    println("Is age of Bashitha_02 present? ${userMap.containsKey("Bashitha_02")}") // Check if age of Bob is present
}
