import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class StockTest {

    @Test
    fun `profit should be when array is equals to {100, 180, 260, 310, 40, 535, 695}`() {
        val array = arrayOf(100, 180, 260, 310, 40, 535, 695)
        val testObject = Stock()

        val actual = testObject.maxProfit(array, 0, array.size - 1)

        assertThat(actual, equalTo(865))
    }
}