package kyu7

fun createBox(width: Int, length: Int): Array<IntArray> {
    // Put your code here.
    var arr = Array(length) { IntArray(width) }
    var max_num = width / 2 + (width % 2)
    var num = 1
    var siw = 0
    var eiw = width - 1
    var sil = 0
    var eil = length-1

    while (num <= max_num){
        for (i in sil..eil){
            for (j in siw..eiw){
                arr[i][j] = num
            }
        }

        num++
        sil++
        siw++
        eil--
        eiw--
    }

    return arr
}