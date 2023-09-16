import java.util.Scanner

fun main(){
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter the number: ")
    var num = read.nextInt()
    println()
    println("******OUTPUT******")
    if (num  % 2 == 0) {
        println("Number ${num} is even")
    }
    if (num % 2 == 1) {
        println("Number ${num} is odd")
    }
    println()
}