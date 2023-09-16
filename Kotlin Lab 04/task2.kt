import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    print("Enter row and col (odd): ")
    var n = read.nextInt()
    while (n < 1 || n % 2 == 0 )  {
        print("Invalid Re-enter (odd, positive > 0): ")
        n = read.nextInt()
    }
    var i: Int = 1
    var j: Int = n / 2 
    var k: Int  = 0 
    repeat (n)
    {
        repeat (j) { print(" ") }
        repeat (i) { print("*") }
        if (k++ < n/2 ) {
            j--
            i += 2
        }
        else {
            j++
            i -= 2
        }
        println()
    }
    println()
}