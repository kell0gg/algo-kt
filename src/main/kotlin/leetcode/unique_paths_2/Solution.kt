package leetcode.unique_paths_2

class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val map = Array(obstacleGrid.size) { IntArray(obstacleGrid[0].size) { 0 } }

        for (i in obstacleGrid.indices) {
            for (j in obstacleGrid[0].indices) {
                if (obstacleGrid[i][j] == 1) continue
                if (i == 0 && j == 0) map[i][j] = 1
                else if (i == 0) map[i][j] = map[i][j - 1]
                else if (j == 0) map[i][j] = map[i - 1][j]
                else map[i][j] = map[i - 1][j] + map[i][j - 1]
            }
        }
        return map[obstacleGrid.size - 1][obstacleGrid[0].size - 1]
    }
}


