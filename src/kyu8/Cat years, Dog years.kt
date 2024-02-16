package kyu8

fun calculateYears(years: Int): Array<Int> {
    return when(years) {
        1 -> arrayOf(years, 15, 15)
        2 -> arrayOf(years, 24, 24)
        else -> arrayOf(years, 24 + (years - 2) * 4, 24 + (years - 2) * 5)
    }
}