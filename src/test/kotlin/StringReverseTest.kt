import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringReverseTest {

    @Test
    fun `text should be reversed when text is equals to "a,b$c"`() {
        val input = "a,b\$c"
        val testObject = StringReverse()

        val output = testObject.reverse(input)

        assertEquals(output, "c,b\$a")
    }

    @Test
    fun `text should be reversed when text is equals to "Ab,c,de!$"`() {
        val input = "a,b\$c"
        val testObject = StringReverse()

        val output = testObject.reverse(input)

        assertEquals(output, "c,b\$a")
    }
}
