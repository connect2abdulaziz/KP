import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT *******" )
    print("Enter number to calculate factorial: ")
    var num = read.nextInt()
    while (num < 0 ) {
        println("Invalid number\nRe-enter: ")
        num = read.nextInt()
    }
    var fact: Long = 1
    var i: Int = 2
    repeat (num - 1) {
        fact *= i
        i++
    }
    print("\nEnter number to calculate factorial of what if any: ")
    var value  = read.nextLong()
    while (value < 0 ) {
        println("Invalid number\nRe-enter: ")
        value = read.nextLong()
    }
    println()
    println("****** OUTPUT *******" )
    println("Factorial of ${num} is: ${fact}")
    var temp: Int = 2
    var flag : Boolean = false 
    var original = value
    if (value == 1L ) println ( "1 is Factorial of: ${original} and 0" )
    else {
        while ( value > 0L  &&  (value % temp == 0L) ) {
            if ( value - temp == 0L ) { 
                flag = true
                break
            }
            value /= temp
            temp++
        }
        if (flag) println ( "${original} is Factorial of: ${temp}" )
        else println("${original} is Not perfect factorial of any number")
    }
    //Method # 2
   // var fact1: Long = 1L
   // var j: Int = 2 
   // while ( fact1 < original) fact1 *= j++
   // if (fact1 == original ) println("${original} is Factorial ${j - 1}")
   // else println("${original} is Not Perfect Factorial")
    println()
}
