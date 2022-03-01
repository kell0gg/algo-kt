package leetcode.plus_one_66

class Solution {
    fun plusOne(digits: IntArray): IntArray {

        for (i in digits.size - 1 downTo 0) {
            digits[i] += 1
            if (digits[i] < 10) return digits
            digits[i] = 0
        }

        val arr = IntArray(digits.size + 1)
        arr[0] = 1

        return arr
    }
}

fun main() {
    var digits: IntArray = intArrayOf(9)
    var solution = Solution()
    solution.plusOne(digits)
}