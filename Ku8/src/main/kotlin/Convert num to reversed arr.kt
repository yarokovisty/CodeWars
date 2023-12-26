fun main() {
   printArr(digitize(35231))
    printArr(digitize(35231))
}

fun digitize(n:Long): IntArray {
    // Code here
    var len = 1
    var num = n
    var num2 = n

    while (num / 10 != 0L){
        num/=10
        len++
    }


    var arr = IntArray(len)

    for (i in 0..len-1){
        arr[i] = (num2%10).toInt()
        num2/=10
    }

    return arr
}

fun digitize2(n:Long): IntArray {
    // Code here
    return n.toString().map(Character::getNumericValue).toIntArray().reversedArray()
}

fun printArr(arr: IntArray) {
    for (i in arr) {
        println(i)
    }
}