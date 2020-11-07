import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class TripletsTest {

    @Test
    fun `count should be 2 when array is equals to {-2, 0, 1, 3}`() {
        val arr = arrayOf(-2, 0, 1, 3)
        val testObject = Triplets(arr)

        val actual = testObject.getCount(2)

        assertThat(actual, equalTo(2))
    }

    @Test
    fun `count should be 4 when array is equals to {5, 1, 3, 4, 7}`() {
        val arr = arrayOf(5, 1, 3, 4, 7)
        val testObject = Triplets(arr)

        val actual = testObject.getCount(12)

        assertThat(actual, equalTo(4))
    }
}
