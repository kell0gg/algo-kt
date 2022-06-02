package leetcode.positions_of_large_groups_830

fun main() {
    val solution = Solution()
    val result = solution.largeGroupPositions("aaa")

    for (i in result) {
        println(i)
    }
}

class Solution {
    fun largeGroupPositions(s: String): List<List<Int>> {

        var start = 0
        var end = 0

        val answer: MutableList<List<Int>> = ArrayList()

        var before = s[0]
        var flag = false

        for (i in 1 until s.length) {
            if (before == s[i]) {
                flag = true
                end++
            } else {
                flag = false
                before = s[i]
                if (end - start >= 2) {
                    answer.add(listOf(start, end))
                }
                end++
                start = end
            }
        }
        if (flag) {
            if (end - start >= 2) {
                answer.add(listOf(start, end))
            }
        }
        return answer
    }
}