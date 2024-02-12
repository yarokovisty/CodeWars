package kyu8

fun maps(arr: IntArray): IntArray{
    arr.forEachIndexed {i, el ->
        arr[i] = el * 2
    }
    return arr
}