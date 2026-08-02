class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val result = IntArray(temperatures.size)
        val stack = ArrayDeque<Int>()

        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val previous = stack.removeLast()
                result[previous] = i - previous
            }
            stack.addLast(i)
        }
        return result
    }
}
