import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter positive number: ")
    var num = read.nextInt()
    while (num < 0) {
        println("Invalid input\nRe-enter the positive: ")
        num = read.nextInt()
    }
    println()
    println("****** OUTPUT ******")
    for (i in 1..num) print("${i} ")
    println()
}