class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        nums.sort()

        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue
            }
            var j = i + 1
            var k = nums.size - 1

            while (j < k) {
                var total = nums[i] + nums[j] + nums[k]
                if (total > 0) {
                    k--
                } else if (total < 0) {
                    j++ 
                } else {
                    result.add(listOf(nums[i], nums[j], nums[k]))
                    j++

                    while (nums[j] == nums[j - 1] && j < k) {
                        j++
                    }
                }
            }
        }
        return result.toList()
    }
}
