package leetcode.rotate_string_796

fun main() {
    /*
    "bbbacddceeb"
    "ceebbbbacdd"
     */
    val solution = Solution()
    val result = solution.rotateString("bbbacddceeb", "ceebbbbacdd")
    println(result)
}

class Solution {
    fun rotateString(s: String, goal: String): Boolean {
        if (s.length != goal.length) return false
        val startingPoints: MutableList<Int> = ArrayList()
        val startPoint = goal.indexOf(s[0])

        for (i in goal.indices) {
            if (goal[i] == s[0]) startingPoints.add(i)
        }

        if (startingPoints.size == 0) return false
        if (startPoint == -1) return false


        var count = 0
        for (i in startingPoints) {
            var idx = i
            var originIdx = 0

            for (i in 1 until goal.length) {
                idx = (idx + 1) % goal.length
                originIdx++
                if (s[originIdx] != goal[idx]) {
                    count++
                    break
                }
            }
        }
        return count != startingPoints.size
    }
}