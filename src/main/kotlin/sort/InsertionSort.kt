package sort

class InsertionSort {
    fun sort(array: IntArray) {
        for (i in 1 until array.size) {
            val key = array[i]
            var j = i - 1

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j--
            }
            array[j + 1] = key
        }
    }

    fun sortAlt(array: IntArray) {
        for (i in 1 until array.size) {
            for (j in i downTo 1) {
                if (array[j - 1] > array[j]) {
                    val temp = array[j - 1]
                    array[j - 1] = array[j]
                    array[j] = temp
                }
            }
        }
    }
}
