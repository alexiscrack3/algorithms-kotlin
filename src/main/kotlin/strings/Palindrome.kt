package strings

class Palindrome {

    fun isPalindrome(text: String, start: Int = 0, end: Int = text.length - 1): Boolean {
        var l = start
        var r = end
        while (l < r) {
            if (text[l] == text[r]) {
                l++
                r--
            } else {
                return false
            }
        }
        return true
    }

    fun isPalindromePermutation(text: String): Boolean {
        val strMap = HashMap<Char, Int>()

        text.replace("[^A-Za-z]".toRegex(), "").forEach {
            strMap[it] = (strMap [it] ?: 0) + 1
        }

        val oddCharacters = strMap.count {
            it.value.rem(2) == 1
        }

        return oddCharacters <= 1
    }

    fun getPalindromicPartitions(
        partitions: MutableList<String>,
        text: String,
        partition: String,
        start: Int
    ) {
        if (start == text.length) {
            partitions.add(partition)
            return
        }
        var delimiter = " "
        var i = start
        while (i < text.length) {
            if (isPalindrome(text, start, i)) {
                val index = i + 1
                if (index == text.length) {
                    delimiter = ""
                }
                val substring = text.substring(start, index)
                val newString = partition + substring + delimiter
                getPalindromicPartitions(partitions, text, newString, index)
            }
            i++
        }
    }
}
