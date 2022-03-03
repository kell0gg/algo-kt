package leetcode.robot_return_to_origin_657

class Solution {
    fun judgeCircle(moves: String): Boolean {

        // 1. U, D
        // 2. L, R
        var ud = 0
        var lr = 0

        moves.forEach {
            when (it) {
                'U' -> ud++
                'D' -> ud--
                'L' -> lr--
                'R' -> lr++
                else -> { // pass }
                }
            }
        }

        return ud == 0 && lr == 0
    }
}