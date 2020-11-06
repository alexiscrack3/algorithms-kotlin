import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class ReverseStringTest {

    @Test
    fun `given "a,b$c" when string is reversed then "c,b$a"`() {
        val input = "a,b\$c"
        val testObject = ReverseString()

        val output = testObject.reverse(input)

        assertThat(output, equalTo("c,b\$a"))
    }

    @Test
    fun `given "Ab,c,de!$" when string is reversed then "ed,c,bA!$"`() {
        val input = "a,b\$c"
        val testObject = ReverseString()

        val output = testObject.reverse(input)

        assertThat(output, equalTo("c,b\$a"))
    }
}
