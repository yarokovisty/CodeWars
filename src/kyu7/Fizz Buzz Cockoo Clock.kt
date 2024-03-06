package kyu7

import kotlin.math.min

fun fizzBuzzCuckooClock(time: String): String {
    val (hours, minutes) = time.split(":").map(String::toInt).let { (hours, minutes) ->
        if (hours % 12 == 0) 12 to minutes
        else hours % 12 to minutes
    }

    return when {
        minutes == 0 -> {
            List(hours){"Cuckoo"}.joinToString(" ")
        }
        minutes == 30 -> {
            "Cuckoo"
        }
        minutes % 15 == 0 -> {
            "Fizz Buzz"
        }
        minutes % 3 == 0 -> {
            "Fizz"
        }
        minutes % 5 == 0 -> {
            "Buzz"
        }
        else -> {
            "tick"
        }
    }

}