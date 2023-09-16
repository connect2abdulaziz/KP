import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter positive number: ")
    var num = read.nextInt()
    while ( num < 0) {
        println("Invalid input\nRe-enter the positive: ")
        num = read.nextInt()
    }
    println()
    println("****** OUTPUT ******")
    var divisorSum: Int = 0
    for (i in 1..num / 2 ) if (num % i == 0) divisorSum += i
    if (divisorSum == num) println("${num} is perfect")
    else println("${num} is not perfect")
    println()
}