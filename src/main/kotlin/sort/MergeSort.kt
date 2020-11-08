package sort

class MergeSort {

    fun sort(array: IntArray) {
        mergeSort(array, IntArray(array.size) , 0, array.size - 1)
    }

    private fun mergeSort(array: IntArray, temp: IntArray, leftStart: Int, rightEnd: Int) {
        if (leftStart >= rightEnd) {
            return
        }
        val middle = (leftStart + rightEnd) / 2
        mergeSort(array, temp, leftStart, middle)
        mergeSort(array, temp, middle + 1, rightEnd)
        mergeHalves(array, temp, leftStart, rightEnd)
    }

    private fun mergeHalves(array: IntArray, temp: IntArray, leftStart: Int, rightEnd: Int) {
        val leftEnd = (leftStart + rightEnd) / 2
        val rightStart = leftEnd + 1
        val length = rightEnd - leftStart + 1

        var left = leftStart
        var right = rightStart
        var index = leftStart

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left]
                left++
            } else {
                temp[index] = array[right]
                right++
            }
            index++
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1)
        System.arraycopy(array, right, temp, index, rightEnd - right + 1)
        System.arraycopy(temp, leftStart, array, leftStart, length)
    }
}
