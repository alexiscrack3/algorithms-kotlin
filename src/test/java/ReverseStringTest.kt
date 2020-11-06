import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class ReverseStringTest {

    @Test
    fun `Hello World!`() {
        val input = "a,b\$c"
        val testObject = ReverseString()

        val output = testObject.reverse(input)

        assertThat(output, equalTo("c,b\$a"))
    }
}
