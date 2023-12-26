/*
You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.*/

fun main() {
    println(Solution.areaOrPerimeter(6, 10))
    println(Solution.areaOrPerimeter(3, 3))
    println(Solution1.areaOrPerimeter(6, 10))
    println(Solution1.areaOrPerimeter(3, 3))
}

object Solution {
    fun areaOrPerimeter(l:Int, w:Int):Int {
        // code away...
        return if (l == w) w*w else w*2 + l*2
    }
}

object Solution1 {
    fun areaOrPerimeter(l:Int, w:Int): Int {
        return when {
            w == l -> w * l
            else -> (w + l) * 2
        }
    }


}