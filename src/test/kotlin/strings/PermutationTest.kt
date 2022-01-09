package strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PermutationTest {

    @Test
    fun `isPermutation should return true when string is permutation of the other`() {
        val strA = "abc"
        val strB = "cba"
        val testObject = Permutation()

        assertTrue(testObject.isPermutationNormal(strA, strB))
        assertTrue(testObject.isPermutationBetter(strA, strB))
    }

    @Test
    fun `isPermutation should return false when string is not permutation of a non-empty string`() {
        val strA = "abc"
        val strB = "xyz"
        val testObject = Permutation()

        assertFalse(testObject.isPermutationNormal(strA, strB))
        assertFalse(testObject.isPermutationBetter(strA, strB))
    }

    @Test
    fun `isPermutation should return false when string is not permutation of a empty string`() {
        val strA = "abc"
        val strB = ""
        val testObject = Permutation()

        assertFalse(testObject.isPermutationNormal(strA, strB))
        assertFalse(testObject.isPermutationBetter(strA, strB))
    }
}
