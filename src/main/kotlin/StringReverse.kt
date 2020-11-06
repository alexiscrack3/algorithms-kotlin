
class StringReverse {

    fun reverse(text: String): String {
        val arr = Array(text.length) { text[it] }
        var start = 0
        var end = text.length - 1
        while (start < end) {
            if (text[start].isLetter().not()) {
                start++
            } else if (text[end].isLetter().not()) {
                end--
            } else {
                val temp = text[start]
                arr[start] = arr[end]
                arr[end] = temp
                start++
                end--
            }
        }
        return arr.joinToString("")
    }

    fun reverseAlt(input: String): String {
        val output = StringBuilder()
        for (char in input) {
            if (char.isLetterOrDigit()) {
                output.insert(0, char)
            }
        }
        for (char in input) {
            if (char.isLetterOrDigit().not()) {
                val index = input.indexOf(char)
                output.insert(index, char)
            }
        }
        return output.toString()
    }
}
