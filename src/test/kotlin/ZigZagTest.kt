import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class ZigZagTest {

    @Test
    fun `count should be reversed when text is equals to {4, 3, 7, 8, 6, 2, 1}`() {
        val arr = arrayOf(4, 3, 7, 8, 6, 2, 1)
        val expected = arrayOf(3, 7, 4, 8, 2, 6, 1)
        val testObject = ZigZag(arr)

        val actual = testObject.convert()

        assertThat(actual, equalTo(expected))
    }

    @Test
    fun `count should be reversed when text is equals to {1, 4, 3, 2}`() {
        val arr = arrayOf(1, 4, 3, 2)
        val expected = arrayOf(1, 4, 2, 3)
        val testObject = ZigZag(arr)

        val actual = testObject.convert()

        assertThat(actual, equalTo(expected))
    }

    @Test
    fun `count should be reversed when text is equals to {1,2,3,4,5,6,7}`() {
        val arr = arrayOf(1, 2, 3, 4, 5, 6, 7)
        val expected = arrayOf(1, 3, 2, 5, 4, 7, 6)
        val testObject = ZigZag(arr)

        val actual = testObject.convert()

        assertThat(actual, equalTo(expected))
    }
}
