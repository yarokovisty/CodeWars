package kyu7
import java.util.Stack

fun validParentheses(str: String): Boolean {
    val stack = Stack<Char>()

    for (char in str) {
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
