package kyu6

fun decodeMorse(morseCode: String): String {
    // Define a dictionary to map Morse code to letters and digits
    val morseCodeMap = mapOf(
        ".-" to "A",
        "-..." to "B",
        "-.-." to "C",
        "-.." to "D",
        "." to "E",
        "..-." to "F",
        "--." to "G",
        "...." to "H",
        ".." to "I",
        ".---" to "J",
        "-.-" to "K",
        ".-.." to "L",
        "--" to "M",
        "-." to "N",
        "---" to "O",
        ".--." to "P",
        "--.-" to "Q",
        ".-." to "R",
        "..." to "S",
        "-" to "T",
        "..-" to "U",
        "...-" to "V",
        ".--" to "W",
        "-..-" to "X",
        "-.--" to "Y",
        "--.." to "Z",
        ".----" to "1",
        "..---" to "2",
        "...--" to "3",
        "....-" to "4",
        "....." to "5",
        "-...." to "6",
        "--..." to "7",
        "---.." to "8",
        "----." to "9",
        "-----" to "0",
        "" to " ",
        ".-.-.-" to ".",
        "--..--" to ",",
        "---..." to ".",
        "..--.." to "?",
        "-.-.--" to "!",
        "...---..." to "SOS",
        "-....-" to "''",
        "-..-." to "/",
        "-.--.-" to "()",
        ".--.-." to "@",
        "-...-" to "="
    )

    // Split the Morse code by spaces to get individual Morse code sequences
    val morseWords = morseCode.trim().split("   ")

    // Decode each Morse code word into letters
    val decodedWords = mutableListOf<String>()
    for (word in morseWords) {
        val decodedWord = StringBuilder()
        val morseLetters = word.split(" ")
        for (morseLetter in morseLetters) {
            if (morseLetter in morseCodeMap) {
                decodedWord.append(morseCodeMap[morseLetter])
            }
        }
        decodedWords.add(decodedWord.toString())
    }

    // Join the decoded words to form the final message

    return decodedWords.joinToString(" ")

}