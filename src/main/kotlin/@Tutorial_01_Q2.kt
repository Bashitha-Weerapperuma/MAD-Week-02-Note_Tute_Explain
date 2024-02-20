//Write a Kotlin function to calculate the circumference of a circle for a given radius value.
fun calculateCir(radius: Double):Double {
    return 2*Math.PI*radius
}

fun main(){
    val radius =5.0
    val cirfer =calculateCir(radius)
    println("Circumference of the circle with radius $radius is $cirfer")
}