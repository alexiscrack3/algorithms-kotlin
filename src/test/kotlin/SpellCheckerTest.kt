import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SpellCheckerTest {

    @Test
    fun `encode words`() {
        val input = "LDWLD"
        val testObject = SpellChecker()

        val actual = testObject.encode(input)

        assertThat(actual, equalTo("WLDLD"))
    }
}