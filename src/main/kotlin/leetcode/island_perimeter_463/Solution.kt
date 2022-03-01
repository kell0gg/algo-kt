package leetcode.island_perimeter_463

class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {

        // 0 1 0 0
        // 1 1 1 0
        // 0 1 0 0
        // 1 1 0 0
        var i = 0
        var n = 0
        for (row in grid.indices) {
            for (col in 0 until grid[row].size) {
                if (grid[row][col] == 1) {
                    i++

                    // right neighborhood
                    if (col + 1 < grid[row].size && grid[row][col + 1] == 1) {
                        n++
                    }

                    // down neighborhood
                    if (row + 1 < grid.size && grid[row + 1][col] == 1) {
                        n++
                    }
                }
            }
        }
        return (i * 4) - (n * 2)
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.islandPerimeter(
        arrayOf(
            intArrayOf(0, 1, 0, 0),
            intArrayOf(1, 1, 1, 0),
            intArrayOf(0, 1, 0, 0),
            intArrayOf(1, 1, 0, 0)
        )
    )
    println(result)
}