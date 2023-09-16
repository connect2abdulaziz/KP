import java.util.Scanner

fun main(){
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter the 1st number let A: ")
    var num1 = read.nextInt()
    print("Enter the 2nd number let B: ")
    var num2 = read.nextInt()
    println()
    println("******OUTPUT******")
    println("1st number: ${num1}\n2nd number: ${num2}")
    if (num1 > num2){
        println("1st number is greater")
    }
    if (num2 < num2){
        println("2nd number is greater")
    }
    if (num1 == num2){
        println("Both numbers are equal")
    }
    println()
}