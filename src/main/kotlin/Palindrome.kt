class Palindrome {

    fun isPalindrome(text: String): Boolean {
        var l = 0
        var r = text.length - 1
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
}
