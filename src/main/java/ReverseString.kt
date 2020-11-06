import java.lang.StringBuilder

class ReverseString {

    fun reverse(input: String): String {
        val output = StringBuilder()
        for (char in input) {
            if (char.isLetter() || char.isDigit()) {
                output.insert(0, char)
            }
        }
        for (char in input) {
            if (char.isLetter().not() && char.isDigit().not()) {
                val index = input.indexOf(char)
                output.insert(index, char)
            }
        }
        return output.toString()
    }
}
