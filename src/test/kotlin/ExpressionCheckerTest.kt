import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ExpressionCheckerTest {

    @Test
    fun `expression should be balanced when expression do not have missing parentheses`() {
        val expression = "[()]{}{[()()]()}"
        val testObject = ExpressionChecker()

        val actual = testObject.isBalanced(expression)

        assertTrue(actual)
    }

    @Test
    fun `expression should not be balanced when expression do not have missing parentheses`() {
        val expression = "[(}]"
        val testObject = ExpressionChecker()

        val actual = testObject.isBalanced(expression)

        assertFalse(actual)
    }
}
