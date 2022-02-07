package arranging_coins_441

class Solution {
    fun arrangeCoins(n: Int): Int {
        if (n == 1) return 1

        var left: Long = 0
        var right: Long = n.toLong()

        while (left < right) {
            var mid: Long = left + (right - left) / 2
            var tmp = (mid * (mid + 1)) / 2
            if (tmp.toInt() == n) {
                return mid.toInt()
            } else if (tmp > n) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return (left - 1).toInt()
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.arrangeCoins(5)
    println(result)
}