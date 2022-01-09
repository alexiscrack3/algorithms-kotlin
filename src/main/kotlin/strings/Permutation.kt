package strings

class Permutation {

    // O(nlog(n)) solution
    fun isPermutationNormal(strA: String, strB: String): Boolean {
        if (strA.length != strB.length) {
            return false
        }
        return strA.toList().sorted() == strB.toList().sorted()
    }

    fun isPermutationBetter(strA: String, strB: String): Boolean {
        if (strA.length != strB.length) {
            return false
        }
        val mapA = convertStrToMap(strA)
        val mapB = convertStrToMap(strB)
        return mapA == mapB
    }

    private fun convertStrToMap(input: String): HashMap<Char, Int> {
        val map: HashMap<Char, Int> = HashMap()
        input.forEach {
            map[it] = (map[it] ?: 0) + 1
        }
        return map
    }
}