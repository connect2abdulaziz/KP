import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    println()
    println("******INPUT******")
    print("Enter two color to mix (red, blue, yellow)\nColor #1: ")
    var color1 = read.nextLine()
    color1 = validate(color1)
    print("Color #2: ")
    var color2 = read.nextLine()
    color2 = validate(color2)
    println()
    println("******OUTPUT******")
    if ((color1 == "red" && color2 == "blue") || (color2 == "red" && color1 == "blue")) {
        println("You get color after mixing ${color1} & ${color2} is: purple")
    }
    if ((color1 == "red" && color2 == "yellow") || (color2 == "red" && color1 == "yellow")) {
        println("You get color after mixing ${color1} & ${color2} is: orange")
    }
    if ((color1 == "yellow" && color2 == "blue") || (color2 == "yellow" && color1 == "blue")) {
        println("You get color after mixing ${color1} & ${color2} is: green")
    }
    println()
}

fun validate(value: String): String{
    val read = Scanner(System.`in`)
    var num = value
    while (!(num == "red" || num == "yellow" || num == "blue" )) {
        print("Invalid Color\nRe-enter (red, blue, yellow): ")
        num = read.nextLine()
    }
    println()
    return num  
}