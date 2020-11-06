
class ReverseString {

    fun reverse(input: String): String {
        val arr = Array(input.length) { input[it] }
        var start = 0
        var end = input.length - 1
        while (start < end) {
            if (input[start].isLetter().not()) {
                start++
            } else if (input[end].isLetter().not()) {
                end--
            } else {
                val temp = input[start]
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
