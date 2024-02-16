package kyu8

fun abbrevName(name: String): String {
    val names = name.split(" ")
    if (names.size != 2) {
        return "Invalid input"
    }
    val firstInitial = names[0].firstOrNull()?.toUpperCase() ?: ""
    val secondInitial = names[1].firstOrNull()?.toUpperCase() ?: ""
    return "$firstInitial.$secondInitial"
}