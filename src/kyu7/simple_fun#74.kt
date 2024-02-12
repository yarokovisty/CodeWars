package kyu7

fun growingPlant(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    if (upSpeed >= desiredHeight) return 1
    else {
        var height = 0
        var days = 0

        while (height < desiredHeight) {
            days++

            height += upSpeed
            println("After day $days --> $height")

            if (height >= desiredHeight) break

            height -= downSpeed
            println("After night $days --> $height")
        }

        return days
    }
}