fun main(){
    var fruits= arrayOf("Mango","Orange","Banana","Apple", "Watermelon")

    //get Array Size
    println("Array Size "+fruits.size)
                                println("")
    //Display a Array Element
    println(fruits[1]) //orange
                                println("")
    //Display All array Elements
    //method 01
    for(a in fruits){
        println(a)
    }
                                println("")
    //Display All array Elements
    //method02
    var i=0
    while(i<5){
        println(fruits[i])
        i++
    }

}
