import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter num: ")
    var num  = read.nextInt()
    var previous: Int = 0
    while ( num != 0 ) {
        previous = num
        print( "Next: " )
        num = read.nextInt()
    }
    println()
    println("****** OUTPUT ******\n")
    if ( previous == 0 ) println( "The 1st number is Zero\nNo Previous Integer given by user" )
    else println( "Last non-zero number: ${previous}")
    println()
}
