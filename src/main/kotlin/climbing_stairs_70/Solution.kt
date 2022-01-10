package climbing_stairs_70

class Solution {

    fun climbStairs(n: Int): Int {

        if (n <= 1) return 1

        val dp = IntArray(n + 1)
        dp[1] = 1
        dp[2] = 2

        for (i in 3..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n]
    }

    // Time Limit Exceeded
//    var total: Int = 0
//    fun climbStairs(n: Int): Int {
//        nextStep(n, 0)
//        return total
//    }
//
//    fun nextStep(n: Int, current: Int): Unit {
//        if (current == n) {
//            total++
//            return
//        }
//
//        if (current > n) {
//            return
//        }
//
//        nextStep(n, current + 1)
//        nextStep(n, current + 2)
//    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.climbStairs(3)
    println(result)
}