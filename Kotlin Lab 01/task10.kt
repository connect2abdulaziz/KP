import java.util.Scanner

fun main() {
    println()
    println("******INPUT******")
    val read = Scanner(System.`in`)
    print("Enter tow numbers: ")
    var num1 = read.nextInt()
    var num2 = read.nextInt()
    println()
    println("******OUTPUT******")
    println("Before Swap: ${num1}  ${num2}")
    val temp = num1
    num1 = num2
    num2 = temp
    println("After Swap: ${num1}  ${num2}")
    println()
}