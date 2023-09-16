import java.util.Scanner

fun main() {
    while (true) {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter the number of Chairs you purchased: ")
    var chairs = read.nextInt()
    while (chairs < 0) {
        println("Invalid chairs\nPlease make sure you have entered a positive number of chairs: ")
        chairs = read.nextInt()
    }
    var cost = chairs * 1250
    var discount: Float = 0.0f
    if (chairs < 10 ) {
        discount = 0.0f
    }
    else if (chairs < 20 ) {
        discount = 0.20f
    }
    else if (chairs < 50) {
        discount = 0.30f
    }
    else if (chairs < 100) {
        discount = 0.40f
    }
    else if ( chairs >= 100) {
        discount = 0.50f
    }
    println()
    println("****** OUTPUT ******")
    println("# of chairs: ${chairs}")
    println("Original cost: ${cost}")
    println("Discount: "+ Math.round((discount * cost ) *100.0)/100.0)
    println("Cost after discount: "+ Math.round ((cost - (discount * cost )) *100.0)/100.0)
    println()
}
}