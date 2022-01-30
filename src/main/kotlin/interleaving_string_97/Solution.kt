package interleaving_string_97

import java.util.*


class Solution {
    // https://leetcode.com/discuss/explore/june-leetcoding-challenge-2021/1247753/interleaving-string-simple-explained-dfs-using-stack-java
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s1.length + s2.length != s3.length) return false

        val stack = Stack<Pair<Int, Int>>()
        stack.push(Pair(0, 0))

        val visited = Array(s1.length + 1) {
            BooleanArray(
                s2.length + 1
            )
        }

        while (!stack.empty()) {
            val current: Pair<Int, Int> = stack.pop()
            visited[current.first][current.second] = true

            if (current.first == s1.length && current.second == s2.length) return true

            if (current.first < s1.length && !visited[current.first + 1][current.second]
                && s1[current.first] == s3[current.first + current.second]
            ) {
                stack.push(Pair(current.first + 1, current.second))
            }

            if (current.second < s2.length && !visited[current.first][current.second + 1]
                && s2[current.second] == s3[current.first + current.second]
            ) {
                stack.push(Pair(current.first, current.second + 1))
            }
        }

        return false
    }
}

fun main(args: Array<String>) {

}