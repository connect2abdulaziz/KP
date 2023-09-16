import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter the amount of purchase: ")
    var amount = read.nextInt()
    amount = validate (amount)
    println()
    println("******OUTPUT******")
    println("Amount: $amount")
    println("Federal Tax: "+(Math.round((amount.toFloat() * 0.4) * 100.0)/100.0))
    println("Provincial Tax: "+(Math.round((amount * 0.2 )* 100.0)/100.0))
    println("Total Sales Tax: "+(Math.round((amount * 0.4 + amount * 0.2 ) * 100.0)/100.0))
    println("Total Amount: "+ (Math.round((amount + amount * 0.4 + amount * 0.2) * 100.0)/100.0))
    // Method # 2
    // var federalTax = (amount * 4 )/100
    // var  provincialTax = (amount * 2)/100
    // var totalSalesTax = federalTax + provincialTax
    // var  totalAmount = amount + totalSalesTax
    // println("******OUTPUT******")
    // println("Amount: $amount")
    // println("Federal Tax: $federalTax")
    // println("Provincial Tax: $provincialTax")
    // println("Total Sales Tax: $totalSalesTax")
    // println("Total Amount: $totalAmount")
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