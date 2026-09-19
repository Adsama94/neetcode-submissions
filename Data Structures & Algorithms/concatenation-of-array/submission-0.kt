class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val resultArray = IntArray(nums.size * 2)
        for (i in nums.indices) {
            resultArray[i] = nums[i]
            resultArray[i + nums.size] = nums[i]
        }
        return resultArray
    }
}
