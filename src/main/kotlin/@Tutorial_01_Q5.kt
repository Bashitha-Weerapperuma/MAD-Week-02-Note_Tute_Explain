//a. Create a mutable list that contains multiplications of 3 from 0 to 100.
//b. Replace all the even numbers of above list from 999


fun main() {
    // Part a:
                                                // Create a mutable list that contains multiplications of 3 from 0 to 100
    val multiplesOf3 = mutableListOf<Int>()     // Creating an empty mutable list to store multiples of 3
    for (i in 0..100 step 3) {            // Looping from 0 to 100 with a step of 3
        multiplesOf3.add(i)                     // Adding each multiple of 3 to the list
    }

    // Part b:
    // Replace all the even numbers of the list with 999
    for (i in multiplesOf3.indices) {           // Looping through the indices of the list
        if (multiplesOf3[i] % 2 == 0) {         // Checking if the element at current index is even
            multiplesOf3[i] = 999               // Replacing even numbers with 999
        }
    }

    // Print the modified list
    println("Modified List:")
    println(multiplesOf3)                        // Printing the modified list
}
