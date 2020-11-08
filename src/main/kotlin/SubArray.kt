class SubArray {

    fun getLengthOfLongestContiguousSubarray(array: Array<Int>): Int {
        var maxLength = 1
        for (i in 0 until array.size - 1) {
            var minimum = array[i]
            var maximum = array[i]

            for (j in i + 1 until array.size) {
                minimum = Math.min(minimum, array[j])
                maximum = Math.max(maximum, array[j])

                if (maximum - minimum == j - i) {
                    maxLength = Math.max(maxLength, maximum - minimum + 1)
                }
            }
        }
        return maxLength
    }
}
