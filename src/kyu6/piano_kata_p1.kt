package kyu6

fun blackOrWhiteKey(keyPressCount : Int) : String {
    // your code here
    val button = keyPressCount % 88

    when (button) {
        0 -> return "white"
        1 -> return "white"
        2 -> return "black"
        3 -> return "white"
    }

    val buttonPattern = (button - 4) % 12
    if((buttonPattern in 0..4)) {
        if (buttonPattern % 2 != 0) {
            return "black"
        }
        else{
            return "white"
        }
    }
    else if((buttonPattern in 5..11)) {
        return if (buttonPattern % 2 == 0) {
            "black"
        } else{
            "white"
        }
    } else return ""
}
