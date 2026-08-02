class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = ArrayDeque<Int>()
        var maxArea = 0

        for (i in 0..heights.size) {
            val currentHeight = if (i == heights.size) 0 else heights[i]
            while (stack.isNotEmpty() && currentHeight < heights[stack.last()]) {
                val height = heights[stack.removeLast()]
                val width = if (stack.isEmpty()) {
                    i
                } else {
                    i - stack.last() - 1
                }
                maxArea = maxOf(maxArea, height * width)
            }
            stack.addLast(i)
        }
        return maxArea
    }
}
