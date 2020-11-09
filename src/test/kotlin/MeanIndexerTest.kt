import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

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

        assertThat(actual[0], equalTo(listOf(0, 4)))
        assertThat(actual[1], equalTo(listOf(1)))
        assertThat(actual[2], equalTo(listOf(2)))
        assertThat(actual[3], equalTo(listOf(3)))
    }
}
