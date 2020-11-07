import org.junit.Assert.assertArrayEquals
import org.junit.Test

class ArrayGeneratorTest {

    @Test
    fun `array should be generated when combining two arrays`() {
        val arrayA = arrayOf(10, 15, 25)
        val arrayB = arrayOf(1, 5, 20, 30)
        val result = mutableListOf<Array<Int>>()
        val expected = listOf(
            arrayOf(10, 20),
            arrayOf(10, 20, 25, 30),
            arrayOf(10, 30),
            arrayOf(15, 20),
            arrayOf(15, 20, 25, 30),
            arrayOf(15, 30),
            arrayOf(25, 30)
        )
        val testObject = ArrayGenerator()

        testObject.generate(arrayA, arrayB, arrayA.size, arrayB.size, result)

        assertArrayEquals(result[0], expected[0])
        assertArrayEquals(result[1], expected[1])
        assertArrayEquals(result[2], expected[2])
        assertArrayEquals(result[3], expected[3])
        assertArrayEquals(result[4], expected[4])
        assertArrayEquals(result[5], expected[5])
        assertArrayEquals(result[6], expected[6])
    }
}