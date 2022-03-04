package leetcode.valid_palindrome_2_680

class Solution {
    fun validPalindrome(s: String): Boolean {
        // 1. 1개를 지운다.
        // 2. 화인한다.

        var left = 0
        var right = s.length - 1

        while (left < right && s[left] == s[right]) {
            left++
            right--
        }
        if (left == right) return true

        return validPalindromUtil(s, left+1, right) || validPalindromUtil(s, left, right-1)
    }

    private fun validPalindromUtil(s: String, left: Int, right: Int): Boolean {
        var l = left
        var r = right
        while (l < r) {
            if (s[l] != s[r]) return false
            l++
            r--
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.validPalindrome("abca")
    println(result)
}