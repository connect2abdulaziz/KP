import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter positive number: ")
    var num = read.nextInt()
    while (num < 0 || num > Integer.MAX_VALUE) {
        println("Invalid input\nRe-enter the positive: ")
        num = read.nextInt()
    }
    val originalNumber = num
    var sum: Int = 0
    while (num != 0 ) {
    sum += num%10
    num /= 10
    }
    println()
    println("****** OUTPUT ******")
    println("Original Number: ${originalNumber}\nSum of its Digits: ${sum}")
    println()
}