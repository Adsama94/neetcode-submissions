class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val numberSet = mutableSetOf<Int>()
        for (number in nums) {
            if (numberSet.contains(number)) {
                return true
            }
            numberSet.add(number)
        }
        return false
    }
}
