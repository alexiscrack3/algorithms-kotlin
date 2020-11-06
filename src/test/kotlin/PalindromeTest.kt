import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class PalindromeTest {

    @Test
    fun `text should be a palindrome when text is equals to "a"`() {
        val input = "a"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(true))
    }

    @Test
    fun `text should be a palindrome when text is equals to "aba"`() {
        val input = "aba"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(true))
    }

    @Test
    fun `text should be a palindrome when text is equals to "abba"`() {
        val input = "abba"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(true))
    }

    @Test
    fun `text should be a palindrome when text is equals to "ababa"`() {
        val input = "ababa"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(true))
    }

    @Test
    fun `text should be a palindrome when text is equals to "civic"`() {
        val input = "civic"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(true))
    }

    @Test
    fun `text should be a palindrome when text is equals to "level"`() {
        val input = "level"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(true))
    }

    @Test
    fun `text should not be a palindrome when text is equals to "abaa"`() {
        val input = "abaa"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(false))
    }

    @Test
    fun `text should not be a palindrome when text is equals to "ababb"`() {
        val input = "ababb"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertThat(output, equalTo(false))
    }
}