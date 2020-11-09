import java.util.*

class ExpressionChecker {

    fun isBalanced(expression: String): Boolean {
        val stack = Stack<Char>()
        for (i in 0 until expression.length) {
            val char = expression[i]
            if (isOpeningBracket(char)) {
                stack.push(char)
            } else {
                val top = stack.pop()
                if (!canCloseBrackets(top, char)) {
                    return false
                }
            }
        }
        return stack.isEmpty()
    }

    private fun canCloseBrackets(openingChar: Char, closingChar: Char): Boolean {
        return (openingChar == '(' && closingChar == ')') ||
                (openingChar == '{' && closingChar == '}') ||
                (openingChar == '[' && closingChar == ']')
    }

    private fun isOpeningBracket(char: Char): Boolean {
        return listOf('(', '{', '[').contains(char)
    }
}
