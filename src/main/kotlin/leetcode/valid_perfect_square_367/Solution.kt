package leetcode.valid_perfect_square_367

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if (num == 1)
            return true;

        var left = 1
        var right = num
        while (left <= right) {
            var mid = left + (right - left) / 2
            var res = num / mid
            var remains = num % mid
            if (res == mid && remains == 0) return true
            if (mid < num / mid) left = mid + 1
            else right = mid - 1
        }
        return false
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    solution.isPerfectSquare(5)
}