package range_addition_2_598


class Solution {
    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
        if (ops.isNullOrEmpty()) return m * n

        var row = Int.MAX_VALUE
        var col = Int.MAX_VALUE

        for (o in ops) {
            row = kotlin.math.min(row, o[0])
            col = kotlin.math.min(col, o[1])
        }
        return row * col
    }
    // Memory Limit Exceeded
//    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {
//        val map: Array<IntArray> = Array(m) { i -> IntArray(n) { j -> 0 } }
//
//        for (o in ops) {
//            for (row in 0 until o[0]) {
//                for (col in 0 until o[1]) {
//                    map[row][col]++
//                }
//            }
//        }
//
//        var max = 0
//        for (row in 0 until m) {
//            for (col in 0 until n) {
//                max = kotlin.math.max(max, map[row][col])
//            }
//        }
//
//        var count = 0
//        for (row in 0 until m) {
//            for (col in 0 until n) {
//                if (map[row][col] == max) count++
//            }
//        }
//        return count
//    }
}