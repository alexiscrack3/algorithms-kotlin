import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StockTest {

    @Test
    fun `profit should be when array is equals to {100, 180, 260, 310, 40, 535, 695}`() {
        val array = arrayOf(100, 180, 260, 310, 40, 535, 695)
        val testObject = Stock()

        val actual = testObject.maxProfit(array, 0, array.size - 1)

        assertEquals(actual, 865)
    }
}