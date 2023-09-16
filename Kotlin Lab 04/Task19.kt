import java.util.Scanner
import kotlin.math.pow
import kotlin.math.round

fun main() {
    val read = Scanner(System.`in`)
    println("****** INPUT ******")
    print ("Enter interest rate: ")
    val rate = read.nextFloat() / 100
    print("Enter the number of payments: ")
    val payments = read.nextFloat()
    print("Enter the loan amount: ")
    val loan = read.nextFloat()
    val monthlyPayments = (rate * ( 1 + rate ).pow(payments) * loan ) / ( (1 + rate ).pow(payments) - 1)
    println("\n****** OUTPUT ******")
    val amountBack = monthlyPayments * payments
    val interestPaid = amountBack - loan
    println("Loan Amount: $$loan\nMonthly Interest Rate: ${rate * 100 }%\nNumber of Payments: $payments")
    println("Monthly Payment: $${round(monthlyPayments * 100.0)/100.0}")
    println("Amount Paid Back: $${round(amountBack * 100.0)/100.0}")
    println("Interest Paid: $${round(interestPaid * 100.0 )/ 100.0}")
}