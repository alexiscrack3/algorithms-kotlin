package search

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class MergeSortTest {

    @Test
    fun `value should be found when array is equals to {8, 9, 3, 6, 5, 1, 2}`() {
        val array = intArrayOf(8, 9, 3, 6, 5, 1, 2)
        val expected = intArrayOf(1, 2, 3, 5, 6, 8, 9)
        val testObject = MergeSort()

        testObject.sort(array)

        assertArrayEquals(array, expected)
    }

    @Test
    fun `value should be found when array is equals to {38, 27, 43, 3, 9, 82, 10}`() {
        val array = intArrayOf(38, 27, 43, 3, 9, 82, 10)
        val expected = intArrayOf(3, 9, 10, 27, 38, 43, 82)
        val testObject = MergeSort()

        testObject.sort(array)

        assertArrayEquals(array, expected)
    }
}
