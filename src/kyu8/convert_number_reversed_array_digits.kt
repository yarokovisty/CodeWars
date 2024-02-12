package kyu8

object Convert {
    fun digitize(n:Long):IntArray {
        // Code here
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
}