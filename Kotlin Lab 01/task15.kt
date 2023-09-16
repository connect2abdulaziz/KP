import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter length of three Sides of a triangle\nSide #1: ")
    var s1 = read.nextInt()
    s1 = validate (s1)
    print("Side #2: ")
    var s2 = read.nextInt()
    s2 = validate (s2)
    print("Side #3: ")
    var s3 = read.nextInt()
    s3 = validate (s3)
    println()
    println("******OUTPUT******")
    println("Side #1: ${s1}\nSide #2: ${s2}\nSide #3: ${s3}")
    if ((s1 * s1 + s2 * s2 == s3 * s3 ) or (s1 * s1 + s3 * s3 == s2 * s2) || (s3 * s3 + s2 * s2 == s1 * s1)) {
        println("Right angle Triangle")
    }
    if ((s1 * s1 + s2 * s2 != s3 * s3 ) && (s1 * s1 + s3 * s3 != s2 * s2) and (s3 * s3 + s2 * s2 != s1 * s1)) {
        println("Not Right angle Triangle")
    }
    
    println()
}
fun validate (value : Int): Int {
    val read = Scanner(System.`in`)
    var num = value
    while (num < 0) {
        println("Invalid length!\nPlease re-enter correct length: ")
        num = read.nextInt()
    }
    return num
}