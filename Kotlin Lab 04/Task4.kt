import java.util.Scanner
import kotlin.math.round

fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT *****")
    print("Enter the actual price value: ")
    var actualPrice = read.nextInt()
    while (actualPrice < 0) {
        print("Invalid actual amount\nRe-enter:  ")
        actualPrice = read.nextInt()
    }
    val assessmentValue = round(actualPrice * 0.60 * 100.0) / 100.0
    println("\n****** OUTPUT *****")
    println("Actual Value: $ $actualPrice\nAssessment Value: $ $assessmentValue\nProperty tax: ${round(assessmentValue * 0.0075 * 100.0) / 100.0}")
}

