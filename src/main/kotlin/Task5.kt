fun findIntegerExponent(n: Int, x: Int): Int? {
    var y = 0

    while (Math.pow(x.toDouble(), y.toDouble()).toInt() <= n) {
        if (Math.pow(x.toDouble(), y.toDouble()).toInt() == n) {
            return y
        }
        y++
    }

    return null
}

fun main() {
    val n2 = println("введите число: ")
    val n1 = readln()
    val n = n1.toInt()
    val x2 = println("введите основание степени: ")
    val x1 = readln()
    val x = x1.toInt()
    val exponent = findIntegerExponent(n, x)

    if (exponent != null) {
        println(exponent)
    } else {
        println("такого не существует")
    }
}