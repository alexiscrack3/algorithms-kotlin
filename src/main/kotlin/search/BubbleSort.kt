package search

class BubbleSort {

    fun sort(array: IntArray) {
        for (i in 0 until array.size) {
            for (j in 0 until array.size - i - 1) {
                if (array[j] >= array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
    }
}
