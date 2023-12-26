fun main() {
    println(solution(20))
}

fun solution(number: Int): Int {
    return if (number < 0) 0
    else{
        var num = 0

        for (i in 3..<number step 3) {
            num += i
        }

        for (i in 5..<number step 5) {
            if (i % 3 != 0) num += i
        }

        num

    }
}