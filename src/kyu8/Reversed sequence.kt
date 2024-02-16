package kyu8

fun reverseSeq(n: Int): List<Int> {

    return List(n) {(it + 2) - 1} .reversed()
}