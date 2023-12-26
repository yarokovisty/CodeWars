/* It's pretty straightforward.
Your goal is to create a function that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry with strings with less than two characters. */

fun main() {
    println(removeChar1("Kotlin"))
    println(removeChar2("place"))
    println(removeChar3("Java"))
}

fun removeChar1(str: String) = str.drop(1).dropLast(1) // drop - вытаскивает первые символы, dropLast - вытаскивает последние символы

fun removeChar2(str: String) = str.substring(1, str.length - 1) // substring - выводит подстроку с определенной позиции

fun removeChar3(str: String) = str.substring(1, str.lastIndex)


