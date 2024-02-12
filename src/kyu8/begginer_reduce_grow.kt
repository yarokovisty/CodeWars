package kyu8

fun grow(arr: IntArray): Int {
    var num = 1
    arr.forEach{el ->
        num *= el
    }
    return num
}