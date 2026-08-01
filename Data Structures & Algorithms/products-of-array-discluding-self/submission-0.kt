class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val resultArray = IntArray(size)
        var suffix = 1

        resultArray[0] = 1

        for (i in 1 until size) {
            resultArray[i] = resultArray[i - 1] * nums[i - 1]
        }

        for (i in size - 1 downTo 0) {
            resultArray[i] *= suffix
            suffix *= nums[i]
        }
        return resultArray
    }
}
