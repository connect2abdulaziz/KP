import java.util.Scanner
import kotlin.math.round
import kotlin.math.pow

fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT ******")
    print("Movie Name: ")
    val movie = read.nextLine()
    print("How many tickets were sold\nChild Tickets: ")
    var childTickets = read.nextInt()
    while (childTickets < 0) {
        println("Invalid Child Tickets\nRe-enter: ")
        childTickets = read.nextInt()
    }
    print("Adult Tickets: ")
    var adultTickets = read.nextInt()
    while (adultTickets < 0) {
        println("Invalid Adult Tickets\nRe-enter: ")
        adultTickets = read.nextInt()
    }
    val priceAdultTicket = 10.00
    val priceChildTicket = 6.00
    val netPercentage = 0.20
    val grossProfit = round((adultTickets * priceAdultTicket + childTickets * priceChildTicket )* 100.0)/100.0
    val netProfit = round(((adultTickets * priceAdultTicket + childTickets * priceChildTicket) * 0.2 )* 100.0)/100.0
    val distributorPrice = grossProfit - netProfit
    println("\n****** OUTPUT ******")
    println("Movie Name: $movie\nAdult Tickets Sold: $adultTickets\nChild Tickets Sold: $childTickets")
    println("Gross Box Office Profit: $ $grossProfit")
    println("Net Box Office Profit: $ $netProfit")
    println("Amount Paid to Distributor: $ $distributorPrice")
}