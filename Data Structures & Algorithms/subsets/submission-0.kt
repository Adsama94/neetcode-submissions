class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>(listOf())
        
        for (number in nums) {
            val size = result.size
            for (i in 0 until size) {
                val newSubset = result[i].toMutableList()
                newSubset.add(number)
                result.add(newSubset)
            }
        }
        return result
    }
}
