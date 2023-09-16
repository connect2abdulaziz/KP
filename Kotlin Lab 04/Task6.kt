import java.util.Scanner
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.round
fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT ******")
    print("Enter the Diameter of the pizza in inches: ")
    val diameter = read.nextFloat()
    val area = PI * (diameter / 2).pow(2)
    println("****** OUTPUT ******")
    println("PI: $PI\nDiameter: $diameter\nArea: $area")
    println("The no of Slices: ${round (area / 14.125 * 100.0)/100.0  } ")
}