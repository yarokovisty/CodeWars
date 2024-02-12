package kyu8

fun countPositivesSumNegatives(input : Array<Int>?) : Array<Int> {
    //code here
    return if (input.isNullOrEmpty()) {
        emptyArray()
    } else {
        val arr = arrayOf(0, 0)

        input.forEach {
            if (it > 0) arr[0]++
            else arr[1] += it
        }

        arr
    }

}