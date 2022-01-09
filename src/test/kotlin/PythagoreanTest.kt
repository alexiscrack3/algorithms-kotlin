import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PythagoreanTest {

    @Test
    fun `result should be true when array is equals to {3, 1, 4, 6, 5}`() {
        val array = arrayOf(3, 1, 4, 6, 5)
        val testObject = Pythagorean()

        val actual = testObject.containsTriplet(array)

        assertEquals(actual, true)
    }

    @Test
    fun `result should be false when array is equals to {10, 4, 6, 12, 5}`() {
        val array = arrayOf(10, 4, 6, 12, 5)
        val testObject = Pythagorean()

        val actual = testObject.containsTriplet(array)

        assertEquals(actual, false)
    }
}
