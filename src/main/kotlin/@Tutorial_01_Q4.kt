//Write a Kotlin function to determine whether a given integer number is prime.
fun isPrime(number:Int):Boolean{
    if(number <=1){
        return false // Numbers less than or equal to 1 are not prime
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false // If number is divisible by any number other than 1 and itself, it's not prime
        }
    }
    return true // If no divisor found, the number is prime
}

fun main(){
    val number = 17 // Example number
    if (isPrime(number)) {
        println("$number is prime")
    } else {
        println("$number is not prime")
    }
}