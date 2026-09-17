class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        intervals.sortBy { it[1] }
        var previousEnd = intervals[0][1]
        var result = 0

        for (i in 1 until intervals.size) {
            if (previousEnd > intervals[i][0]) {
                result++
            } else {
                previousEnd = intervals[i][1]
            }
        }
        return result
    }
}
