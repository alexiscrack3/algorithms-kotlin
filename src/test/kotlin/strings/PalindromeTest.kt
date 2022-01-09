package strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromeTest {

    @Test
    fun `text should be a palindrome when text is equals to 'a'`() {
        val input = "a"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertTrue(output)
    }

    @Test
    fun `text should be a palindrome when text is equals to 'aba'`() {
        val input = "aba"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertTrue(output)
    }

    @Test
    fun `text should be a palindrome when text is equals to 'abba'`() {
        val input = "abba"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertTrue(output)
    }

    @Test
    fun `text should be a palindrome when text is equals to 'ababa'`() {
        val input = "ababa"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertTrue(output)
    }

    @Test
    fun `text should be a palindrome when text is equals to 'civic'`() {
        val input = "civic"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertTrue(output)
    }

    @Test
    fun `text should be a palindrome when text is equals to 'level'`() {
        val input = "level"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertTrue(output)
    }

    @Test
    fun `text should not be a palindrome when text is equals to 'abaa'`() {
        val input = "abaa"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertFalse(output)
    }

    @Test
    fun `text should not be a palindrome when text is equals to 'ababb'`() {
        val input = "ababb"
        val testObject = Palindrome()

        val output = testObject.isPalindrome(input)

        assertFalse(output)
    }

    @Test
    fun `result should contain all possible palindromic partitions when text is equals to 'nitin'`() {
        val input = "nitin"
        val testObject = Palindrome()
        val expected = listOf(
            "n i t i n",
            "n iti n",
            "nitin"
        )

        val components = mutableListOf<String>()
        testObject.getPalindromicPartitions(components, input, "", 0)

        assertEquals(components, expected)
    }

    @Test
    fun `result should contain all possible palindromic partitions when text is equals to 'geeks'`() {
        val input = "geeks"
        val testObject = Palindrome()
        val expected = listOf(
            "g e e k s",
            "g ee k s"
        )

        val partitions = mutableListOf<String>()
        testObject.getPalindromicPartitions(partitions, input, "", 0)

        assertEquals(partitions, expected)
    }

    @Test
    fun `result should contain all possible palindromic partitions when text is equals to 'abaaba'`() {
        val input = "abaaba"
        val testObject = Palindrome()
        val expected = listOf(
            "a b a a b a",
            "a b a aba",
            "a b aa b a",
            "a baab a",
            "aba a b a",
            "aba aba",
            "abaaba"
        )

        val partitions = mutableListOf<String>()
        testObject.getPalindromicPartitions(partitions, input, "", 0)

        assertEquals(partitions, expected)
    }
}
