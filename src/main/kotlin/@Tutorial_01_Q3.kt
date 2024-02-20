//Write a Kotlin function to calculate the grades of a student for a given mark according to
//the following criteria.
//100-75 A
//74-65 B
//64-50 C
//49-35 D
//34-00 F
fun calculateGrade(mark:Int):String{
    return when(mark){
        in 75..100 -> "A"
        in 65..74 -> "B"
        in 50..64 -> "C"
        in 35..49 -> "D"
        in 0..34 -> "F"
        else -> "Invalid mark"
    }

}
fun main(){
    val mark = 35 // Example mark
    val grade = calculateGrade(mark)
    println("For a mark of $mark, the grade is $grade")
}