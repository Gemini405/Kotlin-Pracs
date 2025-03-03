//Aim: Create a simple calculator which will take two numbers from the user as an input. Find
//out addition, subtraction, multiplication and division. Users will choose the operations from
//the menu. Use a modular programming approach.

fun getNum():Double
{
    print("Enter a number: ")
    return readln().toDoubleOrNull() ?: 0.0
}

fun calculator(num1:Double, num2:Double)
{
    print("Enter a choice:\n[1] Addition\n[2] Subtraction\n[3] Multiplication\n[4] Division\nEnter your choice (1/2/3/4): ")
    val choice = readln().toIntOrNull() ?: 1

    when (choice)
    {
        1 -> println("$num1 + $num2 = ${num1 + num2}")
        2 -> println("$num1 - $num2 = ${num1 - num2}")
        3 -> println("$num1 * $num2 = ${num1 * num2}")
        4 -> println("$num1 / $num2 = ${num1 / num2}")
        else -> println("Invalid Input")
    }
}

fun main()
{
    val n1 = getNum()
    val n2 = getNum()

    calculator(n1, n2)
}
