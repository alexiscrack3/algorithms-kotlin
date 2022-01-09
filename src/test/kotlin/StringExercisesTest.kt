import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringExercisesTest {

    @Test
    fun `isPermutation should return true when string is permutation of the other`() {
        val strA = "abc"
        val strB = "cba"
        val testObject = StringExercises()

        assertTrue(testObject.isPermutationNormal(strA, strB))
        assertTrue(testObject.isPermutationBetter(strA, strB))
    }

    @Test
    fun `isPermutation should return false when string is not permutation of a non-empty string`() {
        val strA = "abc"
        val strB = "xyz"
        val testObject = StringExercises()

        assertFalse(testObject.isPermutationNormal(strA, strB))
        assertFalse(testObject.isPermutationBetter(strA, strB))
    }

    @Test
    fun `isPermutation should return false when string is not permutation of a empty string`() {
        val strA = "abc"
        val strB = ""
        val testObject = StringExercises()

        assertFalse(testObject.isPermutationNormal(strA, strB))
        assertFalse(testObject.isPermutationBetter(strA, strB))
    }

    @Test
    fun `isUnique should return true when string has all unique characters`() {
        val input = "bar"
        val testObject = StringExercises()

        assertTrue(testObject.isUniqueBest(input))
        assertTrue(testObject.isUniqueBetter(input))
        assertTrue(testObject.isUniqueNormal(input))
    }

    @Test
    fun `isUnique should return false when string does not have unique characters`() {
        val input = "foo"
        val testObject = StringExercises()

        assertFalse(testObject.isUniqueBest(input))
        assertFalse(testObject.isUniqueBetter(input))
        assertFalse(testObject.isUniqueNormal(input))
    }
}
