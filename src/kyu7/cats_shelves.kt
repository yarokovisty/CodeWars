package kyu7

fun solution(start: Int, finish: Int): Int
{
    // Mew
    var govno = (finish - start) / 3
    return govno + (finish - govno * 3 - start)
}