import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter range of 2 number\nStart:")
    var start = read.nextInt()
    print("End: ")
    var end = read.nextInt()
    while (start > end || start < Integer.MIN_VALUE || end > Integer.MAX_VALUE ) {
        println("Invalid input\nRe-enter the range start must less than end: ")
        start = read.nextInt()
        end = read.nextInt()
    }
    println()
    println("****** OUTPUT ******")
    for (i in start..end) if ( ( i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0 ) ) print("${i} ")
    println()
}