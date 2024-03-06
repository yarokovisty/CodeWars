package kyu7

import kotlin.time.times

fun toIndustrial(t: Int) = "%.2f"
    .format(t / 60.0)
    .replace(',', '.')
    .toDouble()

fun toIndustrial(t: String): Double {
    val hours = t.substringBefore(":").toInt()
    val minutes = t.substringAfter(":").toInt()
    val time = hours * 60 + minutes

    return "%.2f"
        .format(time / 60.0)
        .replace(',', '.')
        .toDouble()
}

fun toNormal(t: Double): String {
    var minutes = Math.round((t % 1) * 60)
    var hours = t.toInt()

    if (minutes == 60L) {
        minutes = 0
        hours++
    }

    return String.format("$hours:%02d", minutes)
}