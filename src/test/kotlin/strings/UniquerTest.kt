package strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UniquerTest {

    @Test
    fun `isUnique should return true when string has all unique characters`() {
        val input = "bar"
        val testObject = Uniquer()

        assertTrue(testObject.isUniqueBest(input))
        assertTrue(testObject.isUniqueBetter(input))
        assertTrue(testObject.isUniqueNormal(input))
    }

    @Test
    fun `isUnique should return false when string does not have unique characters`() {
        val input = "foo"
        val testObject = Uniquer()

        assertFalse(testObject.isUniqueBest(input))
        assertFalse(testObject.isUniqueBetter(input))
        assertFalse(testObject.isUniqueNormal(input))
    }
}