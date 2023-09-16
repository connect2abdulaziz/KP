import java.util.Scanner

fun main() {
    val r = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter Subject marks 0-100: ")
    var marks = r.nextInt()
    while (marks < 0 || marks > 100) {
        println("Invalid Marks!\nRe-enter marks 0-100:")
        marks = r.nextInt()
    }
    println()
    println("******OUTPUT******")
    if (marks >= 50) {
        println("Congratulation You have passed")
    }
    if (marks < 50) {
        println("OOPS! You have failed")
    }
    println()
}