import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("How many number you want to enter: ")
    var count = read.nextInt()
    while (count < 0) {
        println("Invalid input\nRe-enter the positive: ")
        count = read.nextInt()
    }
    var value: Int 
    var largest: Int = Integer.MIN_VALUE
    var smallest: Int = Integer.MAX_VALUE
    println("Largest value: ${largest}")
    println("Smallest value: ${smallest}")
    for (i in 0..count - 1) {
        print("Enter ${i+1}th number:") 
        value = read.nextInt()
        if (value > largest ) largest = value
        if (value < smallest ) smallest = value
    }
    println()
    println("****** OUTPUT ******")
    println("Largest value: ${largest}")
    println("Smallest value: ${smallest}")
    println()
}