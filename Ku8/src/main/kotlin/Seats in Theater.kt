fun main() {
    println(seatsInTheater(1, 1, 1, 1))
}

fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
    //coding and coding..
    return (nCols-col+1) * (nRows - row)
}