package vali_palindrome_125

class Solution {
    fun isPalindrome(s: String): Boolean {
        // deprecated - toLowerCase -> lowercase
        //val str = s.lowercase().filter { it.isLetter() || it.isDigit() }.toString()
        val str = s.toLowerCase().filter { it.isLetter() || it.isDigit() }.toString()

        var left: Int = 0
        var right: Int = str.length - 1

        while (left <= right) {
            if (str[left++] != str[right--]) {
                return false
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result: Boolean = solution.isPalindrome("0P")
    println(result)
}