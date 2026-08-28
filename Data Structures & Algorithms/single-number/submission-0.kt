class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (number in nums) {
            result = result xor number
        }
        return result
    }
}
