class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val size = matrix.size

        for (i in 0 until size) {
            for (j in i until size) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }

        for (i in 0 until size) {
            for (j in 0 until size / 2) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[i][size - j - 1]
                matrix[i][size - j - 1] = temp
            }
        }
    }
}
