class Solution {
    fun isPalindrome(s: String): Boolean {
        var cleanedString = s.filter { it.isLetterOrDigit() }.lowercase()
        return cleanedString == cleanedString.reversed()
    }
}
