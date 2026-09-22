class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }
        val result = mutableListOf(intervals[0])

        for (interval in intervals.slice(1 until intervals.size)) {
            val (start, end) = interval
            val lastEnd = result.last()[1]

            if (start <= lastEnd) {
                result[result.size - 1][1] = maxOf(lastEnd, end)
            } else {
                result.add(interval)
            }
        }
        return result.toTypedArray()
    }
}
