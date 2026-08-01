class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        val set = nums.toSet()
        var longestStreak = 0

        for (num in set) {
            if (!set.contains(num - 1)) {
                var currentNum = num
                var currentStreak = 1
                while (set.contains(currentNum + 1)) {
                    currentNum++
                    currentStreak++
                }
                longestStreak = maxOf(longestStreak, currentStreak)
            }
        }

        return longestStreak
    }
}
