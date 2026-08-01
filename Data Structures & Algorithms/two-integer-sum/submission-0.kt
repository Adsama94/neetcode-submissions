class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (currentNumber in nums.indices) {
            val compliment = target - nums[currentNumber]
            if (map.containsKey(compliment)) {
                return intArrayOf(map[compliment]!!, currentNumber)
            }
            map[nums[currentNumber]] = currentNumber
        }
        throw IllegalArgumentException("no solution found")
    }
}
