class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        val dp = mutableListOf<Int>()
        dp.add(nums[0])

        var LIS = 1
        for (i in 1 until nums.size) {
            if (dp[dp.size - 1] < nums[i]) {
                dp.add(nums[i])
                LIS++
                continue
            }
            val idx = dp.binarySearch(nums[i]).let { if (it < 0) -it - 1 else it }
            dp[idx] = nums[i]
        }
        return LIS
    }
}
