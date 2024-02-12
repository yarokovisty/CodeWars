package kyu8

object Solution {
    fun areaOrPerimeter(l:Int, w:Int):Int {
        // code away...
        return if (l == w) w*w else w*2 + l*2
    }
}