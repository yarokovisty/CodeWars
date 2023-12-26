/*
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
*/

fun main() {
    println(evenOrOdd1(1))
    println(evenOrOdd2(28))
    println(evenOrOdd3(0))
}

fun evenOrOdd1(number: Int) = if (number % 2 == 0) "Even" else "Odd"

fun evenOrOdd2(number: Int): String {
    if (number % 2 == 0) {
        return "Even"
    } else {
        return "Odd"
    }
}

fun evenOrOdd3(number: Int) = when(number % 2) {
    0 -> "Even"
    else -> "Odd"
}

