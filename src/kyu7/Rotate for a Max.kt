package kyu7

fun maxRot(n:Long): Long {
    // your code
    val sb = StringBuilder().append(n)
    val lenSb = sb.length - 1
    var maxNum = sb.toString().toLong()

    for (i in 0 until lenSb) {
        val c = sb[i]
        sb.deleteAt(i)
        sb.append(c)
        val num = sb.toString().toLong()

        if (maxNum < num) maxNum = num
    }

    return maxNum
}