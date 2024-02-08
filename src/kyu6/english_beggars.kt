package kyu6

fun beggars(values: List<Int>, n: Int): List<Int> {
    // your code
    val listValue = MutableList(n) {0}
    val len = values.size

    for (i in 0 until n) {
        for (j in i until len step n) {
            if (j <= len) {
                listValue[i] += values[j]
            } else {
                break
            }
        }
    }

    return listValue
}