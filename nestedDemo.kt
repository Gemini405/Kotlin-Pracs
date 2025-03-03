//Aim: Write a program to implement a Nested if statement.

fun main()
{
    print("Enter the first number: ")
    val num1 = readln().toDoubleOrNull() ?: 0.0

    print("Enter the second number: ")
    val num2 = readln().toDoubleOrNull() ?: 0.0

    print("Enter the third number: ")
    val num3 = readln().toDoubleOrNull() ?: 0.0

    var max = if (num1 > num2) {
        if (num1 > num3) {
            num1
        } else {
            num3
        }
    } else if (num2 > num3) {
        num2
    } else {
        num3
    }

    println("$max is the greatest number among the three numbers.")
}
