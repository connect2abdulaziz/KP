import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter a positive number < "+Integer.MAX_VALUE+": ")
    var num = read.nextInt()
    while ( num  < 0 ) {
        println("Invalid input\nPlease enter a positive number: ")
        num = read.nextInt()
    }
    val originalNumber = num
    var reverse: Long = 0
    println()
    println("****** OUTPUT ******\n")
    println("Original Number: ${originalNumber}")
    print("Reverse Number: ")
    while (num != 0 ) {
        reverse = reverse * 10 + num % 10 
        print(num % 10 )
        num /= 10
    }
    println() 
}
