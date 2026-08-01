class Solution {
    fun minWindow(s: String, t: String): String {
        if (s.isEmpty() || t.isEmpty() || s.length < t.length) return ""

        val map = IntArray(128)
        for (char in t) {
            map[char.toInt()]++
        }

        var left = 0
        var right = 0
        var minLength = Int.MAX_VALUE
        var startIndex = 0
        var count = t.length

        while (right < s.length) {
            val rightChar = s[right]
            if (map[rightChar.toInt()] > 0) {
                count--
            }
            map[rightChar.toInt()]--
            right++

            while (count == 0) {
                if (right - left < minLength) {
                    minLength = right - left
                    startIndex = left
                }

                val leftChar = s[left]

                map[leftChar.toInt()]++

                if (map[leftChar.toInt()] > 0) {
                    count++
                }

                left++
            }
        }
        
        return if (minLength == Int.MAX_VALUE) "" else s.substring(startIndex, startIndex + minLength)
    }
}
