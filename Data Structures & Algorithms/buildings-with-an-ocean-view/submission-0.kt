class Solution {
    fun findBuildings(heights: IntArray): IntArray {
        var maxHeight = -1
        val result = mutableListOf<Int>()

        for (i in heights.lastIndex downTo 0) {
            if (heights[i] > maxHeight) {
                result.add(i)
                maxHeight = heights[i]
            }
        }
        result.reverse()
        return result.toIntArray()
    }
}
