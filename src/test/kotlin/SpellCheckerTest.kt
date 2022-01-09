import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SpellCheckerTest {

    @Test
    fun `encode words`() {
        val input = "LDWLD"
        val testObject = SpellChecker()

        val actual = testObject.encode(input)

        assertEquals(actual, "WLDLD")
    }
}