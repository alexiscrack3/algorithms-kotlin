import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class ExpressionCheckerTest {

    @Test
    fun `expression should be balanced when expression do not have missing parentheses`() {
        val expression = "[()]{}{[()()]()}"
        val testObject = ExpressionChecker()

        val actual = testObject.isBalanced(expression)

        assertThat(actual, equalTo(true))
    }

    @Test
    fun `expression should not be balanced when expression do not have missing parentheses`() {
        val expression = "[(}]"
        val testObject = ExpressionChecker()

        val actual = testObject.isBalanced(expression)

        assertThat(actual, equalTo(false))
    }
}
