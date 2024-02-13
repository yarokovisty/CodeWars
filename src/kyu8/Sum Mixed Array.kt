package kyu8

public class MixedSum {

    /*
    * Assume input will be only of Int or String type
    */
    public fun sum(mixed: List<Any>): Int {
        var s = 0
        mixed.forEach { s += (it.toString().toInt()) }
        return s
    }
}