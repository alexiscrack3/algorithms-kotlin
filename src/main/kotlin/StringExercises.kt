class StringExercises {

    fun urlify(str: String, strSize: Int): String {
        val replacementStr = "%20"
        val sb = StringBuilder()

        for (idx in 0 until strSize) {
            if (str[idx] != ' ') {
                sb.append(str[idx])
            } else {
                sb.append(replacementStr)
            }
        }
        return sb.toString()
    }

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

    // O(n) solution
    fun isUniqueBest(input: String) = input.length == input.toSet().size

    // O(n) solution
    fun isUniqueBetter(input: String): Boolean {
        val charSet = mutableSetOf<Char>()
        for (c in input) {
            if (charSet.contains(c)) {
                return false
            } else {
                charSet.add(c)
            }
        }
        return true
    }

    // O(nlog(n)) solution (space complexity = O(n))
    fun isUniqueNormal(input: String): Boolean {
        val charList: List<Char> = input.toList().sorted()
        for ((index, value) in charList.withIndex()) {
            if (index == charList.size - 1)
                return true
            else if (value == charList[index + 1])
                return false
        }
        return true
    }
}
