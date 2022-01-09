import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubArrayTest {

    @Test
    fun `length should be 3 when array is equals to {10, 12, 11}`() {
        val array = arrayOf(10, 12, 11)
        val testObject = SubArray()

        val actual = testObject.getLengthOfLongestContiguousSubarray(array)

        assertEquals(actual, 3)
    }

    @Test
    fun `length should be 2 when array is equals to {14, 12, 11, 20}`() {
        val array = arrayOf(14, 12, 11, 20)
        val testObject = SubArray()

        val actual = testObject.getLengthOfLongestContiguousSubarray(array)

        assertEquals(actual, 2)
    }

    @Test
    fun `length should be 5 when array is equals to {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}`() {
        val array = arrayOf(1, 56, 58, 57, 90, 92, 94, 93, 91, 45)
        val testObject = SubArray()

        val actual = testObject.getLengthOfLongestContiguousSubarray(array)

        assertEquals(actual, 5)
    }

    @Test
    fun `smallest positive number should be 2 when array is equals to {1, 3, 6, 10, 11, 15}`() {
        val array = arrayOf(1, 3, 6, 10, 11, 15)
        val testObject = SubArray()

        val actual = testObject.getSmallestPositiveNumber(array)

        assertEquals(actual, 2)
    }

    @Test
    fun `smallest positive number should be 5 when array is equals to {1, 3, 6, 10, 11, 15}`() {
        val array = arrayOf(1, 1, 1, 1)
        val testObject = SubArray()

        val actual = testObject.getSmallestPositiveNumber(array)

        assertEquals(actual, 5)
    }

    @Test
    fun `smallest positive number should be 10 when array is equals to {1, 1, 3, 4}`() {
        val array = arrayOf(1, 1, 3, 4)
        val testObject = SubArray()

        val actual = testObject.getSmallestPositiveNumber(array)

        assertEquals(actual, 10)
    }

    @Test
    fun `smallest positive number should be 2 when array is equals to {1, 2, 5, 10, 20, 40}`() {
        val array = arrayOf(1, 2, 5, 10, 20, 40)
        val testObject = SubArray()

        val actual = testObject.getSmallestPositiveNumber(array)

        assertEquals(actual, 4)
    }

    @Test
    fun `smallest positive number should be 2 when array is equals to {1, 2, 3, 4, 5, 6}`() {
        val array = arrayOf(1, 2, 3, 4, 5, 6)
        val testObject = SubArray()

        val actual = testObject.getSmallestPositiveNumber(array)

        assertEquals(actual, 22)
    }

    @Test
    fun `length should be 3 when sum of subarray is greater than value array is equals to {1, 4, 45, 6, 0, 19}`() {
        val array = arrayOf(1, 4, 45, 6, 0, 19)
        val testObject = SubArray()

        val actual = testObject.getSmallestSubarrayWithSumGreaterThanValue(array, 51)

        assertEquals(actual, 3)
    }

    @Test
    fun `length should be 1 when sum of subarray is greater than value array is equals to {1, 10, 5, 2, 7}`() {
        val array = arrayOf(1, 10, 5, 2, 7)
        val testObject = SubArray()

        val actual = testObject.getSmallestSubarrayWithSumGreaterThanValue(array, 9)

        assertEquals(actual, 1)
    }

    @Test
    fun `length should be 4 when sum of subarray is greater than value array is equals to {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}`() {
        val array = arrayOf(1, 11, 100, 1, 0, 200, 3, 2, 1, 250)
        val testObject = SubArray()

        val actual = testObject.getSmallestSubarrayWithSumGreaterThanValue(array, 280)

        assertEquals(actual, 4)
    }

//    @Test
//    fun `length should NOT BE POSSIBLE when sum of subarray is greater than value array is equals to {1, 2, 4}`() {
//        val array = arrayOf(1, 2, 4)
//        val testObject = SubArray()
//
//        val actual = testObject.getSmallestSubarrayWithSumGreaterThanValue(array, 8)
//
//        assertEquals(actual, 1)
//    }
}