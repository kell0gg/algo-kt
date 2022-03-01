package leetcode.palindrome_number_09

class Solution {
    fun isPalindrome(x: Int): Boolean {
        val convertedValue = x.toString()
        var left: Int = 0
        var right: Int = convertedValue.length - 1

        while (left < right) {
            if (convertedValue.get(left++) != convertedValue.get(right--)) return false
        }
        return true
    }
}

fun main(args: Array<String>) {
    val solution = Solution();
    val test: Boolean = solution.isPalindrome(-121)
    print(test)
}