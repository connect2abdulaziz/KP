import java.util.Scanner
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT ******")
    print("Enter the Diameter of the pizza in inches: ")
    val diameter = read.nextFloat()
    print("Enter the Number of People: ")
    val people = read.nextInt()
    val area = PI * (diameter / 2).pow(2)
    val requiredSlices = people * 4
    val numberOfPizzasRequired = requiredSlices * 14.125 / area // 14.125 is area of each slice
    println("****** OUTPUT ******")
    println("PI: $PI\nDiameter: $diameter\nArea: $area")
    println("The no of Slices: ${round(area / 14.125 * 100.0) / 100.0} ")
    println("The Required Slices: ${round(requiredSlices * 100.0) / 100.0}")
    println("Required no of Pizza's: ${round(numberOfPizzasRequired * 100.0) / 100.0}")
}