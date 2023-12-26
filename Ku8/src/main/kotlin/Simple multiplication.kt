/*
This kata is about multiplying a given number by eight
if it is an even number and by nine otherwise.
*/

fun main() {
    println(simpleMultiplication1(2))
    println(simpleMultiplication2(3))
}

fun simpleMultiplication1(n: Int) = if (n % 2 == 0) n*8 else n*9

fun simpleMultiplication2(n: Int) = n * (8 + n%2)
