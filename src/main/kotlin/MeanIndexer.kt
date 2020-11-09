/*
* Get mean of each inner array
* Group indexes where mean was the same
* Create array of arrays, inner array should have indexes
 */
class MeanIndexer {

    fun getIndexedGroups(array: List<List<Int>>): MutableList<MutableList<Int>> {
        val means = mutableListOf<Double>()
        for (i in 0 until array.size) {
            val innerArray = array[i]
            val mean = getMean(innerArray)
            means.add(mean)
        }

        val map = mutableMapOf<Double, MutableList<Int>>()
        for (i in 0 until means.size) {
            val mean = means[i]
            if (map.containsKey(mean)) {
                val indexes = map[mean]
                indexes?.add(i)
            } else {
                map[mean] = mutableListOf(i)
            }
        }
        val output = mutableListOf<MutableList<Int>>()
        for (value in map.values) {
            output.add(value)
        }
        return output
    }

    private fun getMean(array: List<Int>): Double {
        var sum = 0
        for (i in 0 until array.size) {
            sum += array[i]
        }
        return sum.toDouble() / array.size
    }
}
