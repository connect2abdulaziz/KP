import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter 3 number:")
    var num1 = read.nextInt()
    var num2 = read.nextInt()
    var num3 = read.nextInt()
    println()
    println("******OUTPUT******")
    println("Number #1: ${num1}\nNumber #2: ${num2}\nNumber #3: ${num3}")
    if (num1 > num2) {
         if ( num1 > num3 ) {
            println("Largest Number: ${num1}")
         }
         if (num1 < num3) {
            println("Largest Number: ${num3}")
         }
    }
    if (num2 > num1 ) {
        if (num2 > num3 ) {
           println("Largest Number: ${num2}") 
        }
        if (num2 < num3) {
            println("Largest Number: ${num3}")
        }
    }
    println()
}
