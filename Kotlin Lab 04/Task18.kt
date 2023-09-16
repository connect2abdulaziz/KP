import java.util.Scanner
import kotlin.math.round

fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT ******")
    print("Enter the temperature in Celsius C: ")
    val C = read.nextFloat()
    val F = 9.0 / 5 * C + 32
    println("\n****** OUTPUT ******")
    println("Temperature in Fahrenheit: ${round(F * 100.0) / 100.0}")
}