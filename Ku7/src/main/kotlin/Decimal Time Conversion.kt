import kotlin.math.roundToInt

fun main() {
    println(toIndustrial(105))
    println(toIndustrial("1:34"))
    println(toNormal(1.57))
}

fun toIndustrial(t: Int): Double{
    val roundNum = "%.2f".format(t / 60.0).replace(',', '.')
    return roundNum.toDouble()
}

fun toIndustrial(t: String): Double{
    val hours = t.substringBefore(":").toInt()
    val minutes = t.substringAfter(":").toInt() + hours * 60
    val roundNum = "%.2f".format(minutes / 60.0).replace(',', '.')
    return roundNum.toDouble()
}

fun toNormal(t: Double): String{
    val hours = t.toInt().toString()
    val minutes = ((t % 1) * 60).roundToInt()
    return "$hours:$minutes"
}