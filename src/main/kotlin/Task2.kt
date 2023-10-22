fun countDistinctChars(input: String): Map<Char, Int> {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }

    return charCountMap.toSortedMap()
}

fun main() {
    val input1 = println("введите буквы без запятых и пробелов:")
    val input = readln()
    val charCountMap = countDistinctChars(input)

    for ((char, count) in charCountMap) {
        println("$char - $count")
    }
}
