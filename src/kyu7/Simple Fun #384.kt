package kyu7

fun isTuringEquation(s: String): Boolean {
    val (a, b, c) = s.split("+", "=").map{it.reversed().toInt()}

    return a + b == c
}