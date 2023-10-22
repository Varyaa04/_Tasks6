//ЗАДАЧА 1

fun countConsecutiveChars(input: String): String {
    var result = ""
    var count = 1

    for (i in 0 until input.length - 1) {
        if (input[i] == input[i + 1]) {
            count++
        } else {
            if (count > 1) {
                result += input[i] + count.toString()
            } else {
                result += input[i]
            }
            count = 1
        }
    }

    if (count > 1) {
        result += input[input.length - 1] + count.toString()
    } else {
        result += input[input.length - 1]
    }

    return result
}

fun main() {
    val input1 = println("введите буквы без запятых и пробелов:")
    val input = readln()
    val result = countConsecutiveChars(input)
    println(result)
}