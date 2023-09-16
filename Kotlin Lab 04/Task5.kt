import java.util.Scanner
import kotlin.math.pow
import kotlin.math.round

val read = Scanner(System.`in`)
fun main() {

    println("****** INPUT *****")
    print("Principal (saving account balance): ")
    var value = read.nextFloat()
    val principal = validate(value)
    print("Interest rate: ")
    value = read.nextFloat()
    val rate = validate(value)
    print("the number of times the interest is compounded: ")
    value = read.nextFloat()
    val times = validate (value)
    val amount = round ( principal * ( 1 + (rate/ 100) / times ).pow(times) * 100.0) / 100.0
    println("\n****** OUTPUT *****")
    println ("Interest Rate: $rate %\nTimes Compounded: $times\nPrincipal: $ $principal")
    println("Interest: $ ${round ((amount - principal ) * 100.0) / 100.0 }\nAmount in savings: $ $amount")
}

fun validate(value1: Float): Float {
    var value = value1
    while (value < 0) {
        print("Invalid value\nRe-enter:")
        value = read.nextFloat()
    }
    return value
}