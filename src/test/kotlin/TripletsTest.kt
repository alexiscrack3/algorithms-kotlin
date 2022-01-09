import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TripletsTest {

    @Test
    fun `count should be 2 when array is equals to {-2, 0, 1, 3}`() {
        val arr = arrayOf(-2, 0, 1, 3)
        val testObject = Triplets(arr)

        val actual = testObject.getCount(2)

        assertEquals(actual, 2)
    }

    @Test
    fun `count should be 4 when array is equals to {5, 1, 3, 4, 7}`() {
        val arr = arrayOf(5, 1, 3, 4, 7)
        val testObject = Triplets(arr)

        val actual = testObject.getCount(12)

        assertEquals(actual, 4)
    }
}
