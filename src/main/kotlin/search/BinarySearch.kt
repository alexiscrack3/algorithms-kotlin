package search

class BinarySearch {

    fun binarySearch(arr: IntArray, l: Int, r: Int, key: Int): Int {
        if (r < l) return -1

        val mid = (l + r) / 2
        if (key == arr[mid]) {
            return mid
        }

        return if (key > arr[mid]) {
            binarySearch(arr, mid + 1, r, key)
        } else {
            binarySearch(arr, l, mid - 1, key)
        }
    }

    fun pivotedBinarySearch(array: IntArray, n: Int, value: Int): Int {
        val pivot = findPivot(array, 0, n - 1)

        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1) {
            return binarySearch(array, 0, n - 1, value)
        }

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (array[pivot] == value) {
            return pivot
        }
        return if (array[0] <= value) {
            binarySearch(array, 0, pivot - 1, value)
        } else {
            binarySearch(array, pivot + 1, n - 1, value)
        }
    }

    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    fun findPivot(arr: IntArray, l: Int, r: Int): Int {
        // base cases
        if (r < l) {
            return -1
        }
        if (r == l) {
            return l
        }

        /* low + (high - low)/2; */
        val mid = (l + r) / 2
        if (mid < r && arr[mid] > arr[mid + 1]) {
            return mid
        }
        if (mid > l && arr[mid] < arr[mid - 1]) {
            return mid - 1
        }
        return if (arr[l] >= arr[mid]) {
            findPivot(arr, l, mid - 1)
        } else {
            findPivot(arr, mid + 1, r)
        }
    }
}
