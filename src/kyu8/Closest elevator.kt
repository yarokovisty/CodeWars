package kyu8

import kotlin.math.abs

fun elevator(left: Int, right: Int, call: Int): String {
    // code here
    return if (abs(right - call) <= abs(left - call)) {
        "right"
    } else {
        "left"
    }
}