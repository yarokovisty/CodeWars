package kyu8

fun replace(s: String): String {
    val vowel = "eEuUiIoOaA"
    val str = StringBuilder()
    s.forEach { c ->
        if (vowel.contains(c)) str.append('!')
        else str.append(c)
    }

    return str.toString()

}