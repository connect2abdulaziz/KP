import java.util.Scanner

fun main(){
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter the books that you purchased this month: ")
    var books = read.nextInt()
    while (books < 0)
    {
        print("Invalid books\nRe-enter the books you purchased: ")
        books = read.nextInt()
    }
    println()
    println("******OUTPUT******")
    if (books == 0){
        println("Earn points: 0")
    }
    if (books == 1){
        println("Earn points: 5")
    }
    if (books == 2){
        println("Earn points: 15")
    }
    if (books >= 3){
        println("Earn points: 30")
    }
    println()
}