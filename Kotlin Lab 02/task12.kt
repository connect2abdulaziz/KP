import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter num: ")
    var num = read.nextInt()
    var sum: Int = 0
    while ( num != 0 ) {
        sum += num
        print("Next: ")
        num = read.nextInt()
    }
    println()
    println("****** OUTPUT ******")
    println("Sum: ${sum}")
    println()
}