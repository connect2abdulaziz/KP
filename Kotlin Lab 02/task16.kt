import java.util.Scanner 

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter number to print Fibonacci up to: ")
    var num = read.nextInt()
    while (num < 0 ) {
        println("Invalid number\nRe-enter: ")
        num = read.nextInt()
    }
    var a: Int = 0
    var b: Int = 1
    var temp: Int
    println("****** OUTPUT ******")
    print("Fibonacci Sequence: ")
    repeat (num) {
        print("${a} ")
        temp = a
        a = b
        b += temp 
    }
    println()
}
