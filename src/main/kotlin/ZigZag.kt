class ZigZag(
    var arr: Array<Int>
) {

    fun convert(): Array<Int> {
        var flag = true
        var i = 0
        while (i < arr.size - 1) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp
                }
            }
            flag = !flag
            i++
        }
        return arr
    }

    fun convertAlt(): Array<Int> {
        var flag = true
        for (i in 0..arr.size - 2) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    val temp = arr[i]
                    arr[i] = arr[i + 1]
                    arr[i + 1] = temp
                }
            }
            flag = !flag
        }
        return arr
    }
}
