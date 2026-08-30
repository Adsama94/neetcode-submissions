class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        if (grid.isEmpty()) {
            return 0
        }
        val numRows = grid.size
        val numColumns = grid[0].size
        var numIslands = 0
        for (i in 0 until numRows) {
            for (j in 0 until numColumns) {
                if (grid[i][j] == '1') {
                    numIslands++
                    dfsIslands(grid, i, j)
                }
            }
        }

        return numIslands
    }

    private fun dfsIslands(grid: Array<CharArray>, i: Int, j: Int) {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] == '0') {
            return
        }
        grid[i][j] = '0'
        dfsIslands(grid, i + 1, j) // down
        dfsIslands(grid, i - 1, j) // up
        dfsIslands(grid, i, j + 1) // right
        dfsIslands(grid, i, j - 1) // left
    }
}