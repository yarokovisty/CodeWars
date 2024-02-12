package kyu6

fun solution(number: Int): Int {
    if (number < 0) return 0
    else {
        var num = 0

        for (i in 3..number-1 step 3) {
            num += i
        }

        for (i in 5..number-1 step 5) {
            if (i % 3 != 0) num += i
        }

        return num
    }
}