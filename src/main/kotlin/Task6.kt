fun createOddNumber(digit1: Int, digit2: Int): Int? {
    if (digit1 == digit2) {
        return null
    }

    val minDigit = minOf(digit1, digit2)
    val maxDigit = maxOf(digit1, digit2)

    if (minDigit % 2 == 0 && maxDigit % 2 == 0) {
        return null
    }

    return Integer.parseInt("$minDigit$maxDigit")
}

fun main() {
    println("введите первое число: ")
    val x = kotlin.io.readln()
    val digit1 = x.toInt()
    println("введите второе число: ")
    val y = kotlin.io.readln()
    val digit2 = y.toInt()
    val oddNumber = createOddNumber(digit1, digit2)

    if (oddNumber != null) {
        println(oddNumber)
    } else {
        println("Создать нечетное число невозможно")
    }
}