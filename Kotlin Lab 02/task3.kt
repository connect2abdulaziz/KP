import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter positive number: ")
    var num = read.nextInt()
    var odd: Int 
    if (num % 2 == 0) odd = num - 1
    else odd = num - 2 
    println()
    println("****** OUTPUT ******")
    var count: Int  = 0
    while (count++ < 5  ) {
        print("${odd} ") 
        odd -= 2
    }
    println()
}