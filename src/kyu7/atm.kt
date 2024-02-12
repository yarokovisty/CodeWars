package kyu7

fun count(number: Int): Int {
    val arr = arrayOf(500, 200, 100, 50, 20, 10)
    var numberCash = number

    if (numberCash % 10 == 0) {
        var num = 0

        for (i in arr) {
            val n = numberCash / i
            if (n != 0){
                num += n
                numberCash -= i * n
            }

        }

        return num
    }
    else return -1
}