fun main() {
    println(dutyFree(377, 40, 9048))
    println(dutyFree1(377, 40, 9048))
}

fun dutyFree(normPrice: Int, discount:Int, hol:Int) = hol * 100 / (normPrice * discount)

fun dutyFree1(normPrice: Int, discount: Int, hol: Int): Int {
    val savingsPerBottle = normPrice * discount / 100
    val bottlesToBuy = hol.toDouble() / savingsPerBottle
    return bottlesToBuy.toInt()
}