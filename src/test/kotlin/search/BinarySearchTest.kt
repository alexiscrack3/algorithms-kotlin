package search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinarySearchTest {

    @Test
    fun `value should be found when array is equals to {2, 3, 4, 10, 40}`() {
        val array = intArrayOf(2, 3, 4, 10, 40)
        val testObject = BinarySearch()

        val actual = testObject.binarySearch(array, 0, array.size - 1, 10)

        assertEquals(actual, 3)
    }

    @Test
    fun `value should be found when array is equals to {10, 15, 20, 30, 40, 50, 60, 70, 80}`() {
        val array = intArrayOf(10, 15, 20, 30, 40, 50, 60, 70, 80)
        val testObject = BinarySearch()

        val actual = testObject.binarySearch(array, 0, array.size - 1, 15)

        assertEquals(actual, 1)
    }

    @Test
    fun `value should be found when array is equals to {3, 4, 5, 6, 1, 2}`() {
        val array = intArrayOf(3, 4, 5, 6, 1, 2)
        val testObject = BinarySearch()

        val actual = testObject.pivotedBinarySearch(array, array.size, 3)

        assertEquals(actual, 0)
    }

    @Test
    fun `value should be found when array is equals to {5, 6, 7, 8, 9, 10, 1, 2, 3}`() {
        val array = intArrayOf(5, 6, 7, 8, 9, 10, 1, 2, 3)
        val testObject = BinarySearch()

        val actual = testObject.pivotedBinarySearch(array, array.size, 3)

        assertEquals(actual, 8)
    }
}
