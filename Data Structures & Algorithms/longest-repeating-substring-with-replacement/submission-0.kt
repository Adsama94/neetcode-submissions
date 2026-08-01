class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val freq = IntArray(26)
        var left = 0
        var maxFreq = 0
        var maxLength = 0

        for (right in s.indices) {
            val index = s[right] - 'A'
            freq[index]++
            maxFreq = maxOf(maxFreq, freq[index])

            while ((right - left + 1) - maxFreq > k) {
                freq[s[left] - 'A']--
                left++
            }
            maxLength = maxOf(maxLength, right - left + 1)
        }
        return maxLength
    }
}
