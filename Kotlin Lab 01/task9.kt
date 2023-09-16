import java.util.Scanner

fun main() {
    println()
    println("******INPUT******")
    val read = Scanner(System.`in`)
    print("Enter 3 digit positive number: ")
    var num = read.nextInt()
    while (num <100 || num> 999) {
        println("Invalid number !\nNumber should be of 3-digit positive: ")
        num = read.nextInt()
    }
    val originalNumber = num;
    var sum = num % 10
    num = num / 10
    sum += num % 10
    num = num / 10
    sum += num
    println()
    println("******OUTPUT******")
    println("Sum of digit of ${originalNumber} is: ${sum} ")
    println()

}