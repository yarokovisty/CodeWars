package kyu8

fun century(number: Int): Int {
    var cen=1
    var num=number
    while(num-100>0)
    {
        cen++
        num-=100
    }
    return cen
}