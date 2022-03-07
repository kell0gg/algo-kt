package leetcode.count_binary_substrings_696

class Solution {
    fun countBinarySubstrings(s: String): Int {
        var count = 0

        for (i in 0 until s.length - 1) {
            var leftBit = s[i]
            var rightBit = s[i + 1]

            if (leftBit != rightBit) {
                var left = i
                var right = i + 1
                while (left >= 0 && right < s.length && (s[left] == leftBit && s[right] == rightBit)) {
                    left--
                    right++
                    count++
                }
            }
        }
        return count
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.countBinarySubstrings("10101")
    println(result)
}