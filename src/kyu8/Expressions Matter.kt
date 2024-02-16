package kyu8

class Kata {
    companion object {
        fun expressionsMatter(a: Int, b: Int, c: Int): Int {
            // Your Code here... Happy Coding!
            return maxOf(
                a + b + c,
                a * b + c,
                a + b * c,
                a * b * c,
                (a + b) * c,
                a * (b + c)
            )
        }
    }
}