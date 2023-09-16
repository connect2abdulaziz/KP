import java.util.Scanner
import kotlin.math.round

fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT ******")
    print("Enter the length of row (in feet): ")
    val length = read.nextFloat()
    print ("Amount of space used by an end-post assembly, (in feet): ")
    val spaceEndPost = read.nextFloat()
    print("Amount of space between the vines, (in feet): ")
    val spaceBtVines = read.nextFloat()
    println("****** OUTPUT ******")
    val grapevines = (length - spaceEndPost * 2 ) / spaceBtVines
    println("Number of grapevines: ${round(grapevines * 100.0) / 100.0}")
}