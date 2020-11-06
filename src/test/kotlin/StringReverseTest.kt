import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class StringReverseTest {

    @Test
    fun `text should be reversed when text is equals to "a,b$c"`() {
        val input = "a,b\$c"
        val testObject = StringReverse()

        val output = testObject.reverse(input)

        assertThat(output, equalTo("c,b\$a"))
    }

    @Test
    fun `text should be reversed when text is equals to "Ab,c,de!$"`() {
        val input = "a,b\$c"
        val testObject = StringReverse()

        val output = testObject.reverse(input)

        assertThat(output, equalTo("c,b\$a"))
    }
}
