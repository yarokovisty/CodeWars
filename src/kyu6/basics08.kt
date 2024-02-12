package kyu6

fun decimalToBinary(decimal: Int): String {
    var n = decimal
    var binary = ""

    while (n > 0) {
        binary = "${n%2}$binary"
        n /= 2
    }

    return binary
}


fun nextHigher(n: Int): Int {
    // your code here
    val countOne = decimalToBinary(n).count{it == '1'}
    var num = n + 1

    while (true) {
        if (decimalToBinary(num).count { it == '1' } == countOne) break
        else num++
    }

    return num
}