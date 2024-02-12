package kyu6

fun persistence(num: Int) : Int {
    var n = num
    var count = 0

    while (n / 10 != 0) {
        n = n.toString().map { it.toString().toInt() }.fold(1){acc, digit -> acc * digit}
        count++
    }

    return count
}