import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter 3-digit positive number: ")
    var num = read.nextInt()
    while (num <100 || num> 999) {
        println("Invalid number !\nNumber should be of 3-digit positive: ")
        num = read.nextInt()
    }
    var originalNumber = num
    var reverse: Int = 0
    while ( num > 0 ) {
        reverse = ( reverse * 10 ) + num % 10
        num = num / 10
    }
    println()
    println("******OUTPUT******")
    println("Original Number: ${originalNumber}\nReversed Number: ${reverse}")
    println()
}