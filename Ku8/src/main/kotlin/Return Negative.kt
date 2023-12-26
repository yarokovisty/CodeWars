fun main() {
    println(Kata.makeNegative(0))
}

object Kata {
    fun makeNegative(x: Int) = if (x < 0) x else -1*x
}