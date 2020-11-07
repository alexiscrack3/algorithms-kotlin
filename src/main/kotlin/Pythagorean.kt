
import java.util.*


class Pythagorean {

    fun containsTriplet(arr: Array<Int>): Boolean {
        // Square array elements
        for (i in arr.indices) {
            arr[i] = arr[i] * arr[i]
        }

        // Sort array elements
        Arrays.sort(arr)

        // Now fix one element one by one and find the other two  elements
        for (i in arr.size - 1 downTo 2) {
            // To find the other two elements, start two index
            // variables from two corners of the array and move
            // them toward each other
            var l = 0 // index of the first element in arr[0..i-1]
            var r = i - 1 // index of the last element in arr[0..i-1]
            while (l < r) {
                // A triplet found
                if (arr[l] + arr[r] == arr[i]) {
                    return true
                }

                // Else either move 'l' or 'r'
                if (arr[l] + arr[r] < arr[i]) {
                    l++
                } else {
                    r--
                }
            }
        }

        // If we reach here, then no triplet found
        return false
    }

    fun containsTripletAlt(array: Array<Int>): Boolean {
        for (i in array.indices) {
            for (j in i + 1 until array.size) {
                for (k in j + 1 until array.size) {
                    if (isPythagoreanValid(array[i], array[j], array[k])) {
                        return true
                    }
                }
            }
        }
        return false
    }

    fun isPythagoreanValid(a: Int, b: Int, c: Int): Boolean {
        return a * a + b * b == c * c
    }
}
