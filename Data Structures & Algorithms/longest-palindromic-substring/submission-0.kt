class Solution {

    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return ""
        var start = 0
        var end = 0

        for (i in 0 until s.length) {
            val length1 = expandAroundCenter(s, i, i)
            val length2 = expandAroundCenter(s, i, i + 1)
            val length = maxOf(length1, length2)

            if (length > end - start) {
                start = i - (length - 1) / 2
                end = i + length / 2
            }
        }
        return s.substring(start, end + 1)
    }

    fun expandAroundCenter(s: String, left: Int, right:Int): Int {
        var l = left
        var r = right

        while (l >= 0 && r < s.length && s[l] == s[r]) {
            l--
            r++
        }
        return r - l - 1
    }

}