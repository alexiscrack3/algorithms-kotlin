import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StringExercisesTest {

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
