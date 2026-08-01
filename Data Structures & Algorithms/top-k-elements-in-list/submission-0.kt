class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
        }
        val frequencyList = mutableListOf<Pair<Int, Int>>()
        for ((num, freq) in frequencyMap) {
            frequencyList.add(num to freq)
        }
        frequencyList.sortByDescending() { it.second }
        return frequencyList.take(k).map { it.first }.toIntArray()
    }
}
