//Aim: Write a program to implement the default argument (while calling a function, no
//arguments are passed) in Kotlin.

fun student(name:String = "Kasper", age:Int = 18, std:String = "FYCS")
{
    println("Name: $name")
    println("Age: $age")
    println("Standard: $std")
}

fun main()
{
    student()
}
