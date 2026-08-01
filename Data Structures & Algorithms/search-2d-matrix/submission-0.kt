class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val columns = matrix[0].size

        var left = 0
        var right = rows * columns - 1

        while (left <= right) {
            val mid = left + (right - left) / 2

            val r = mid / columns
            val c = mid % columns

            val value = matrix[r][c]

            when {
                value == target -> return true
                value < target -> left = mid + 1
                else -> right = mid - 1
            }
        }

        return false
    }
}
