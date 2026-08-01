class Solution {
    fun findDuplicate(nums: IntArray): Int {
        val numSet = mutableSetOf<Int>()
        for (number in nums) {
            if (numSet.contains(number)) {
                return number
            }
            numSet.add(number)
        }
        return 0
    }
}
