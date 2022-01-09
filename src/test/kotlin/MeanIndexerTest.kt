import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MeanIndexerTest {

    @Test
    fun `indexes should be grouped by mean`() {
        val listOfLists = listOf(
            listOf(10, 8), // Index: 0; Mean: 9
            listOf(10, 7), // Index: 1; Mean: 8.5
            listOf(5, 5), // Index: 2; Mean: 5
            listOf(10, 10, 10), // Index: 3; Mean: 10
            listOf(8, 10) // Index: 4; Mean: 9
        )
        val testObject = MeanIndexer()

        val actual = testObject.getIndexedGroups(listOfLists)

        assertEquals(actual[0], listOf(0, 4))
        assertEquals(actual[1], listOf(1))
        assertEquals(actual[2], listOf(2))
        assertEquals(actual[3], listOf(3))
    }
}
