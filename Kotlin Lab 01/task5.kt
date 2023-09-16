import java.util.Scanner

fun main(){
    println()
    println("******INPUT******")
    val read = Scanner(System.`in`)
    print("Enter length of Rectangle #1: ")
    var length1 = read.nextInt()
    length1 = validate (length1)
    print("Enter width of Rectangle #1: ")
    var width1 = read.nextInt()
    width1 = validate (width1)
    print("Enter length of Rectangle #2: ")
    var length2 = read.nextInt()
    length2 = validate (length2)
    print("Enter width of Rectangle #2: ")
    var width2 = read.nextInt()
    width2 = validate (width2)
    var area1 = length1 * width1
    var area2 = length2 * width2
    println()
    println("******OUTPUT******")
    if (area1 > area2){
        println("Rectangle 1 is larger with area ${area1}")
        println("Rectangle 2 is smaller with area ${area2}")
    }
    if (area1 < area2){
        println("Rectangle 2 is larger with area ${area2}")
        println("Rectangle 1 is smaller with area ${area1}")
    }
    if (area1 == area2){
        println("Both rectangles are of the same area which is ${area1}")
    }
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