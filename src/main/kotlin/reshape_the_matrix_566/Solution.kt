package reshape_the_matrix_566

class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        // 0. reshape 가능한지 확인
        if (mat.size * mat[0].size != r * c) return mat

        var rowIdx = 0
        var colIdx = 0

        val reshapeMatrix: Array<IntArray> = Array(r) { IntArray(c) { 0 } }

        // 1. 전체 배열 순차적으로 확인하려면
        for (row in mat.indices) {
            for (col in mat[row].indices) {
                reshapeMatrix[rowIdx][colIdx++] = mat[row][col]
                if (colIdx == c) {
                    colIdx = 0
                    rowIdx++
                }
            }
        }
        return reshapeMatrix
    }
}