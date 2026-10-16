class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val uniqueElements = nums.toSet().sorted()
        for (i in uniqueElements.indices) {
            nums[i] = uniqueElements[i]
        }
        return uniqueElements.size
    }
}
