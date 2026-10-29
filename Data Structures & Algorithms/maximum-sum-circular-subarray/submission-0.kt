class Solution {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var globalMaximum = nums[0]
        var globalMinimum = nums[0]
        var currentMaximum = 0
        var currentMinimum = 0
        var total = 0

        for (num in nums) {
            currentMaximum = maxOf(currentMaximum + num, num)
            currentMinimum = minOf(currentMinimum + num, num)
            total += num
            globalMaximum = maxOf(globalMaximum, currentMaximum)
            globalMinimum = minOf(globalMinimum, currentMinimum)
        }
        return if (globalMaximum > 0) maxOf(globalMaximum, total - globalMinimum) else globalMaximum
    }
}