package kyu7

fun getCount(str : String) : Int {
    val arr = arrayOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    str.forEach {
        if (it in arr) count++
    }

    return count
}