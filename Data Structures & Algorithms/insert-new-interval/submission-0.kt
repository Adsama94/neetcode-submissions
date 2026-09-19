class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        if (intervals.isEmpty()) {
            return arrayOf(newInterval)
        }

        var left = 0
        var right = intervals.size - 1
        val target = newInterval[0]

        while (left <= right) {
            val mid = (left + right) / 2
            if (intervals[mid][0] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        val result = intervals.toMutableList()
        result.add(left, newInterval)

        val res = mutableListOf<IntArray>()
        for (interval in result) {
            if (res.isEmpty() || res.last()[1] < interval[0]) {
                res.add(interval)
            } else {
                res[res.size - 1][1] = maxOf(res.last()[1], interval[1])
            }
        }
        return res.toTypedArray()
    }
}
