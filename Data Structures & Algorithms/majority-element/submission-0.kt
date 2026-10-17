class Solution {
    fun majorityElement(nums: IntArray): Int {
        var result = 0
        var count = 0

        for (number in nums) {
            if (count == 0) {
                result = number
            }
            count += if (number == result) 1 else - 1
        }
        return result
    }
}
