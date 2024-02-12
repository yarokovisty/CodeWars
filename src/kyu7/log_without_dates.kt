package kyu7

fun checkLogs(log: Array<String>): Int {
    // return the mininum number of days
    var day = 1
    val len = log.size

    when (len) {
        0 -> {
            return 0
        }
        1 -> {
            return 1
        }
        else -> {
            for (i in 0..len-2){
                if(log[i] >= log[i+1]) day++
            }

            return day
        }
    }
}