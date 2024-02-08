package kyu6

fun findMissingLetter(array: CharArray): Char {
    val checkLower = array.first().isLowerCase()
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var startIndex = alphabet.indexOfFirst { it == array.first().lowercaseChar() }

    array.forEach { c ->
        if (c.lowercaseChar() != alphabet[startIndex]) {
            return if (checkLower) alphabet[startIndex]
            else alphabet[startIndex].titlecaseChar()
        }
        startIndex++
    }

    return ' '
}