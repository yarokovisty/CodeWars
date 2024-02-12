package kyu8

fun feast(beast: String, dish: String): Boolean {
//your function here
    return beast.first() == dish.first() && beast.last() == dish.last()
}
