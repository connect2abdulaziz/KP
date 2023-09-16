import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter temperature in Degree F: ")
    var temp = read.nextInt()
    println()
    println("****** OUTPUT ******")
    if (temp <= -362 ) print ("All (Mercury, Oxygen and Water) will Freeze")
    else if (temp < -306) print ("Mercury and Water will Freeze")
    else if (temp <= -38) print ("Mercury and Water will Freeze and Oxygen will Boil")
    else if (temp <= 32) print ("Water will Freeze and Oxygen will Boil")
    else if (temp < 212) print ("Oxygen Will Boil")
    else if (temp < 676) print ("Oxygen and Water will Boil")
    else print ("All (Mercury, Oxygen and Water) will Boil")
    println(" at that temperature")
    println()
}