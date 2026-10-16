class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        var size = nums.size
        while (index < size) {
            if (nums[index] == `val`) {
                size--
                nums[index] = nums[size]
            } else {
                index++
            }
        }
        return size
    }
}
