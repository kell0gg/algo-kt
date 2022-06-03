package leetcode.rectangle_overlap_836

fun main() {
    val solution = Solution()
    val result = solution.isRectangleOverlap(intArrayOf(0, 0, 2, 2), intArrayOf(1, 1, 3, 3))
    println(result)
}

class Solution {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        return rec1[2] > rec2[0] && rec1[3] > rec2[1] && rec2[2] > rec1[0] && rec2[3] > rec1[1]
    }
}