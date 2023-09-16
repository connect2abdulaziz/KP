import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter year: ")
    var year = read.nextInt()
    while (year < 0) {
        println("Invalid input\nRe-enter the positive: ")
        year = read.nextInt()
    }
    
    println()
    println("****** OUTPUT ******")
    if ((year % 4 == 0 && year % 100 != 0 ) || (year % 100 == 0 && year % 400 == 0 )) println("${year} is leap year")
    else println("${year} is Not leap year")
    println()
}