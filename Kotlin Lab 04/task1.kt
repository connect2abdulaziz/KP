import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("****** INPUT ******")
    print("Enter three integers: ")
    var num = read.nextLine()
    var a : Int = 0
    var i: Int = 0
    while (num[i].isDigit()) a = a * 10 + (num[i++] - '0').toInt()
    i++
    var b: Int = 0
    while (num[i].isDigit()) b = b * 10 + (num[i++] - '0').toInt()
    i++
    var c: Int = 0
    while (i < num.length) c = c * 10 + (num[i++] - '0').toInt()
    var largest: Int 
    if ( a > b) largest = a
    else largest = b
    if ( largest < c) largest = c
    println()
    println("****** OUTPUT ******")
    println("All integers: ${a} ${b} ${c}\nLargest: ${largest}")
    println()
}