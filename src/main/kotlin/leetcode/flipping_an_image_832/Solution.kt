package leetcode.flipping_an_image_832

fun main() {
    val solution = Solution()
    val arr: Array<IntArray> = Array(3) { intArrayOf() }
    arr[0] = intArrayOf(1, 1, 0)
    arr[1] = intArrayOf(1, 0, 1)
    arr[2] = intArrayOf(0, 0, 0)

    val result = solution.flipAndInvertImage(arr)
    for (i in result) {
        println("${i[0]},${i[1]},${i[2]}")
    }
}

class Solution {
    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
        var idx = 0
        for (row in image) {
            image[idx++] = invert(flipHorizonally(row))
        }
        return image
    }

    private fun flipHorizonally(row: IntArray): IntArray {
        val flipedRow: Array<Int> = Array(row.size) { 0 }
        var idx = 0
        for (i in row.size - 1 downTo 0) {
            flipedRow[idx++] = row[i]
        }
        return flipedRow.toIntArray()
    }

    private fun invert(row: IntArray): IntArray {
        val invertedRow: Array<Int> = Array(row.size) { 0 }
        for (i in row.indices) {
            // 0+1 % 2 -> 1
            // 1+1 % 2 -> 0
            invertedRow[i] = (row[i] + 1) % 2
        }
        return invertedRow.toIntArray()
    }
}