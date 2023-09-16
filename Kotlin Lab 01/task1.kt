import java.util.Scanner

fun main() { 
    println()
    println("******INPUT******")
    val read = Scanner(System.`in`)
    print("Enter the Total Sales: ")
    var totalSales = read.nextInt()
    totalSales = validate (totalSales)
    var annual = Math.round(((totalSales.toFloat() * 23.0) / 100) * 100.0)/100.0
    println()
    println("******OUTPUT******")
    println("The Annual Income i.e (23%) for $totalSales is: $annual")
    println()
}
fun validate(value: Int): Int{
    val read = Scanner(System.`in`)
    var num = value
    while (num <= 0){
        print("Invalid Value\nRe-enter the positive value greater than 0: ")
        num = read.nextInt()
    }
    println()
    return num  
}
