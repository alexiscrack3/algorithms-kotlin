package arrays

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FlowersTest {

    @Test
    fun `canPlaceFlowers should return true when flowersbed has (1, 0, 0, 0, 0, 0, 1, 0, 0) and the number of new flowers is 3`() {
        val list = listOf(1, 0, 0, 0, 0, 0, 1, 0, 0)
        val testObject = Flowers()

        val actual = testObject.canPlaceFlowers(list, 3)

        assertTrue(actual)
    }

    @Test
    fun `canPlaceFlowers should return false when flowersbed has (1, 0, 0, 0, 0, 0, 1, 0, 0) and the number of new flowers is 4`() {
        val list = listOf(1, 0, 0, 0, 0, 0, 1, 0, 0)
        val testObject = Flowers()

        val actual = testObject.canPlaceFlowers(list, 4)

        assertFalse(actual)
    }

    @Test
    fun `canPlaceFlowers should return true when flowersbed has (1, 0, 0, 1, 0, 0, 1, 0, 0) and the number of new flowers is 1`() {
        val list = listOf(1, 0, 0, 1, 0, 0, 1, 0, 0)
        val testObject = Flowers()

        val actual = testObject.canPlaceFlowers(list, 1)

        assertTrue(actual)
    }

    @Test
    fun `canPlaceFlowers should return true when flowersbed has (1, 0, 0, 1, 0, 0, 1, 0, 0) and the number of new flowers is 2`() {
        val list = listOf(1, 0, 0, 1, 0, 0, 1, 0, 0)
        val testObject = Flowers()

        val actual = testObject.canPlaceFlowers(list, 2)

        assertFalse(actual)
    }

    @Test
    fun `canPlaceFlowers should return true when flowersbed has (0) and the number of new flowers is 1`() {
        val list = listOf(0)
        val testObject = Flowers()

        val actual = testObject.canPlaceFlowers(list, 1)

        assertTrue(actual)
    }
}
