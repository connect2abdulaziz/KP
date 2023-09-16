import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter range of 2 number positive\nNumber #1:")
    var num1 = read.nextInt()
    print("Number #2: ")
    var num2 = read.nextInt()
    while (num1 < 0 || num1 > Integer.MAX_VALUE || num2 < 0 || num2  > Integer.MAX_VALUE ) {
        println("Invalid input\nRe-enter the numbers: ")
        num1 = read.nextInt()
        num2 = read.nextInt()
    }
    var product: Int = 0
    println()
    println("****** OUTPUT ******")
    for (i in 1..num2) product += num1
    print("Product of ${num1} and ${num2} is: ${product} ")
    println()
}