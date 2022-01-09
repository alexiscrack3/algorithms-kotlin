import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ExpressionCheckerTest {

    @Test
    fun `expression should be balanced when expression do not have missing parentheses`() {
        val expression = "[()]{}{[()()]()}"
        val testObject = ExpressionChecker()

        val actual = testObject.isBalanced(expression)

        assertEquals(actual, true)
    }

    @Test
    fun `expression should not be balanced when expression do not have missing parentheses`() {
        val expression = "[(}]"
        val testObject = ExpressionChecker()

        val actual = testObject.isBalanced(expression)

        assertEquals(actual, false)
    }
}
