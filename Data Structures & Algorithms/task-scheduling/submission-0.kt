class Solution {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        var count = IntArray(26)
        for (task in tasks) {
            count[task - 'A']++
        }
        val maxFrequency = count.maxOrNull() ?: 0
        var maxCount = 0
        for (cnt in count) {
            if (cnt == maxFrequency) {
                maxCount++
            }
        }

        val time = (maxFrequency - 1) * (n + 1) + maxCount
        return max(tasks.size, time)
    }
}
