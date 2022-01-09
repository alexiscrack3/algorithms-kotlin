package strings

class Urlifier {

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
}
