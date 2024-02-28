package kyu7


fun partList(arr: Array<String>): Array<Array<String>> {
    val result = mutableListOf<Array<String>>()
    val length = arr.size

    for (i in 0 until length-1) {
        val part = arr.slice(0..i).joinToString(" ")
        val part2 = arr.slice(i+1 until length).joinToString(" ")

        result.add(arrayOf(part, part2))
    }

    return result.toTypedArray()
}