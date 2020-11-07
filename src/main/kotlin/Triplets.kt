class Triplets(
    var arr: Array<Int>
) {

    fun getCount(sum: Int): Int {
        var counter = 0
        var i = 0
        while (i < arr.size) {
            var j = i + 1
            while (j < arr.size) {
                var z = j + 1
                while (z < arr.size) {
                    val result = arr[i] + arr[j] + arr[z]
                    if (result < sum) {
                        counter++
                    }
                    z++
                }
                j++
            }
            i++
        }
        return counter
    }
}
