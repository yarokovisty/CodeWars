import java.util.Stack

fun main() {
    println(validParentheses("(((((((((((((())))))))))))))"))
    println(isValidParentheses(""))
}

fun validParentheses(str: String): Boolean {
    val len = str.length

    if (len == 0) return true
    else if (str[0] == ')' || len % 2 == 1) return false
    else {
        val l1 = mutableListOf<Int>()
        val l2 = mutableListOf<Int>()

        str.forEachIndexed{ index, char ->
            if (char == '(') l1.add(index)
            else l2.add(index)
        }

        val l1s = l1.size
        val l2s = l2.size

        if (l1s == l2s) {
            for (i in 0..<l1s){
                if (l1[i] > l2[i]) return false
            }

            return true
        }
        else return false
    }

}

fun isValidParentheses(s: String): Boolean {
    val stack = Stack<Char>()

    for (char in s) {
        when (char) {
            '(' -> stack.push(char)
            ')' -> {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false
                }
            }
        }
    }

    return stack.isEmpty()
}
