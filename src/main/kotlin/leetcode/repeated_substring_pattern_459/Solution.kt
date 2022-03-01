package leetcode.repeated_substring_pattern_459

class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        var len = s.length
        var range = len / 2
        while (range >= 1) {
            if (len % range == 0) {
                val subStr = s.substring(0, range)
                val sb = StringBuilder()

                var pivot = len / range
                for (i in 0 until pivot) {
                    sb.append(subStr)
                }

                if (sb.toString() == s) return true
            }
            range--
        }
        return false
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.repeatedSubstringPattern("abab")
    println(result)
}