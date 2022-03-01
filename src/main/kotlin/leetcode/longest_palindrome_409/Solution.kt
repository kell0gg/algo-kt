package leetcode.longest_palindrome_409

class Solution {
    fun longestPalindrome(s: String): Int {
        val arr: Array<Int> = Array(52) { 0 }
        s.forEach { it ->
            run {
                if (it.isUpperCase()) {
                    arr[it - 'A' + 26]++
                } else if (it.isLowerCase()) {
                    arr[it - 'a']++
                } else {
                    // pass -> throw exception
                }
            }
        }

        var sum = 0
        var flag: Boolean = false
        for (i in arr) {
            if (i % 2 == 0) {
                sum += i
            } else {
                sum += (i - 1)
                flag = true
            }
        }
        if (flag) sum++
        return sum
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.longestPalindrome("AAa")
    println(result)
}