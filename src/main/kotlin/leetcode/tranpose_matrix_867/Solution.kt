package leetcode.tranpose_matrix_867

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val r = matrix.size
        val c = matrix[0].size
        val transposeMatrix: Array<IntArray> = Array(c) { IntArray(r) { 0 } }
        for (row in matrix.indices) {
            for (col in matrix[row].indices) {
                transposeMatrix[col][row] = matrix[row][col]
            }
        }
        return transposeMatrix
    }
}

fun main() {
    val solution = Solution()
    val matrix: Array<IntArray> = Array(3) { IntArray(3) { 0 } }
    var tmp = 1
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            matrix[i][j] = tmp++
        }
    }
    val result = solution.transpose(matrix)
    for (i in result.indices) {
        for (j in result[i].indices) {
            print("${result[i][j]} ")
        }
        println()
    }
}
