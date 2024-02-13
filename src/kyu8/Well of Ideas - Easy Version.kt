package kyu8

fun well(x: Array<String>): String {
    return when(x.count { it == "good" }) {
        0 -> "Fail!"
        in 1..2 -> "Publish!"
        else -> "I smell a series!"
    }
}