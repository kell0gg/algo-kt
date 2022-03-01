package leetcode.add_digits_258

class Solution {
    fun addDigits(num: Int): Int {
        var result = num

        while (true) {
            result = splitAndSum(result)
            if (result < 10) break
        }

        return result
    }

    fun splitAndSum(num: Int): Int {
        var tmpN = num
        var result = 0
        while (tmpN > 0) {
            result += tmpN % 10
            tmpN /= 10
        }
        return result
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.addDigits(38)
    print(result)
}