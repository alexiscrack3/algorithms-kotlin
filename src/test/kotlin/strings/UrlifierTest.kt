package strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UrlifierTest {

    @Test
    fun `urlifiy should replace all spaces in a string with '%20'`() {
        val input = "Mr John Smith   " // 13
        val testObject = Urlifier()
        val actual = testObject.urlify(input, 13)
        assertEquals("Mr%20John%20Smith", actual)
    }
}
