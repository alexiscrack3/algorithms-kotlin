import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class PythagoreanTest {

    @Test
    fun `result should be true when array is equals to {3, 1, 4, 6, 5}`() {
        val array = arrayOf(3, 1, 4, 6, 5)
        val testObject = Pythagorean()

        val actual = testObject.containsTriplet(array)

        assertThat(actual, equalTo(true))
    }

    @Test
    fun `result should be false when array is equals to {10, 4, 6, 12, 5}`() {
        val array = arrayOf(10, 4, 6, 12, 5)
        val testObject = Pythagorean()

        val actual = testObject.containsTriplet(array)

        assertThat(actual, equalTo(false))
    }
}
