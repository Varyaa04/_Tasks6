fun performOperation(number1: Double, number2: Double, operator: Char): Double {
    return when (operator) {
        '/' -> number1 / number2
        '*' -> number1 * number2
        '+' -> number1 + number2
        '-' -> number1 - number2
        else -> throw IllegalArgumentException("Неверный оператор")
    }
}

fun main() {
    val input1 = println("введите число1 число2 символ_операции: ")
    val input = readln()
    val parts = input.split(" ")

    if (parts.size != 3) {
        println("Invalid input")
        return
    }

    val number1 = parts[0].toDoubleOrNull()
    val number2 = parts[1].toDoubleOrNull()
    val operator = parts[2].singleOrNull()

    if (number1 == null || number2 == null || operator == null) {
        println("Invalid input")
        return
    }

    val result = performOperation(number1, number2, operator)
    println(result) // Output: 54.6
}
