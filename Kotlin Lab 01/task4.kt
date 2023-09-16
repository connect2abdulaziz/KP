import java.util.Scanner

fun main(){
    println()
    println("******INPUT******")
    val read = Scanner(System.`in`)
    print("How many Eggs are your bought: ")
    var Eggs = read.nextInt()
    Eggs = validate (Eggs)
    println()
    println("******OUTPUT******")
    println("You have bought "+(Eggs/12)+" dozens and "+(Eggs%12)+" Eggs")
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