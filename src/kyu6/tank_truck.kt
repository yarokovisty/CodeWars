package kyu6

import kotlin.math.*

fun tankVol(h:Int, d:Int, vt:Int):Int {
    val r = d / 2.0

    if (h.toDouble() == r) {
        return vt / 2
    }

    val deep = vt / (PI * r.pow(2))
    val height = if (h > r) {
        r - (d - h)
    }
    else {
        r - h
    }
    val side = sqrt(r.pow(2) - height.pow(2))
    val theta = Math.toDegrees(acos(height / r))
    val remainVol = (360 - 2 * theta) / 360 * vt + side * height * deep
    val v = floor(if (h > r) {
        remainVol
    } else{



        vt - remainVol
    }).toInt()

    return v
}