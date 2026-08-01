class Solution {
    fun isPalindrome(s: String): Boolean {
        var cleanedString = s.lowercase().replace(Regex("[^a-z0-9]"), "")
        return cleanedString == cleanedString.reversed()
    }
}
