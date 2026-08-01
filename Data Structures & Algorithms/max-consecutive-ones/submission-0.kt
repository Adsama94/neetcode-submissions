class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var runningSum = 0
        var maxCount = 0
        for (num in nums) {
            if (num == 1) {
                runningSum++
            } else {
                runningSum = 0
            }
            maxCount = maxOf(runningSum, maxCount)
        }
        return maxCount
    }
}
