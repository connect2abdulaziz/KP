import kotlin.math.round

fun main() {
    val noOfShares = 1000
    val purchasedPerShare = 45.50
    val soldPerShare = 56.90
    val commissionPercent = 2
    val amountPaid = noOfShares * purchasedPerShare
    val amountSoldFor = soldPerShare * noOfShares
    val totalCommission = (amountPaid + amountSoldFor) * commissionPercent / 100
    val profit = amountSoldFor - (amountPaid + totalCommission)
    println("****** OUTPUT ******")
    println("Paid amount for stock: $${round(amountPaid * 100.0) / 100.0}")
    println("Commission for Purchased amount: $${round(amountPaid * commissionPercent / 100 * 100.0) / 100.0}")
    println("Sold for amount: $${round(amountSoldFor * 100.0) / 100.0}")
    println("Commission of Sold for amount: $${round(amountSoldFor * commissionPercent / 100 * 100.0) / 100.0}")
    println("Profit: ${round(profit * 100.0)/100.0}")
}