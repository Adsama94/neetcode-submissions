class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { HashSet<Char>() }
        val columns = Array(9) { HashSet<Char>() }
        val boxes = Array(9) { HashSet<Char>() }

        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val value = board[i][j]
                if (value == '.') continue

                val boxIndex = (i / 3) * 3 + (j / 3)

                if (value in rows[i] ||
                    value in columns[j] ||
                    value in boxes[boxIndex]
                ) {
                    return false
                }

                rows[i].add(value)
                columns[j].add(value)
                boxes[boxIndex].add(value)
            }
        }

        return true
    }
}
