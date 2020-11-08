import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SubArrayTest {

    @Test
    fun `result should be 3 when array is equals to {10, 12, 11}`() {
        val array = arrayOf(10, 12, 11)
        val testObject = SubArray()

        val actual = testObject.getLengthOfLongestContiguousSubarray(array)

        assertThat(actual, equalTo(3))
    }

    @Test
    fun `result should be 2 when array is equals to {14, 12, 11, 20}`() {
        val array = arrayOf(14, 12, 11, 20)
        val testObject = SubArray()

        val actual = testObject.getLengthOfLongestContiguousSubarray(array)

        assertThat(actual, equalTo(2))
    }

    @Test
    fun `result should be 5 when array is equals to {1, 56, 58, 57, 90, 92, 94, 93, 91, 45}`() {
        val array = arrayOf(1, 56, 58, 57, 90, 92, 94, 93, 91, 45)
        val testObject = SubArray()

        val actual = testObject.getLengthOfLongestContiguousSubarray(array)

        assertThat(actual, equalTo(5))
    }
}