package leetcode.find_town_judge_997

class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val count = Array<Int>(n + 1) { 0 }

        for (t in trust) {
            count[t[0]]--
            count[t[1]]++
        }

        for (i in 1 until n + 1) {
            if (count[i] == n - 1) {
                return i
            }
        }
        return -1
    }
}
