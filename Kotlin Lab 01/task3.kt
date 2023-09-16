import java.util.Scanner

fun main(){
    println()
    println("******INPUT******")
    val read = Scanner(System.`in`)
    print("Enter the number of kilometers driven: ")
    var kmDriven = read.nextInt()
    kmDriven = validate(kmDriven)
    print("Enter the number of liters of petrol used: ")
    var literPetrol = read.nextInt()
    literPetrol = validate (literPetrol)
    println()
    println("******OUTPUT******")
    println("KMPL: "+ Math.round(kmDriven.toFloat()/literPetrol * 100.0)/100.0 )
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