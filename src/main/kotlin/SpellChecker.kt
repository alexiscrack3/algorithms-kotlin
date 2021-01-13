class SpellChecker {
    fun encode(letters: String): String {
        var text = letters
        val characters = listOf("W", "L", "D")
        var output = ""
        for (i in 0 until text.length) {
            for (j in 0 until characters.size) {
                val character = characters[j]
                if (text.contains(character)) {
                    val index = text.indexOf(character)
                    text = text.removeRange(index, index + 1)
                    output += character
                }
            }
        }
        return output
    }
}
