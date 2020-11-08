package sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test
import sort.InsertionSort

class InsertionSortTest {

    @Test
    fun `array should be sorted when array is equals to {8, 9, 3, 6, 5, 1, 2}`() {
        val array = intArrayOf(8, 9, 3, 6, 5, 1, 2)
        val expected = intArrayOf(1, 2, 3, 5, 6, 8, 9)
        val testObject = InsertionSort()

        testObject.sort(array)

        assertArrayEquals(array, expected)
    }
}
