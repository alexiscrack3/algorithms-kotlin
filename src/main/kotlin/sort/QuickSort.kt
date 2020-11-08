package sort

class QuickSort {
    fun sort(arr: IntArray) {
        sort(arr, 0, arr.size - 1)
    }

    private fun sort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is 
			now at right place */
            val pi = partition(arr, low, high)

            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi - 1)
            sort(arr, pi + 1, high)
        }
    }

    private fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1 // index of smaller element
        for (j in low until high) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++

                // swap arr[i] and arr[j]
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }
}
