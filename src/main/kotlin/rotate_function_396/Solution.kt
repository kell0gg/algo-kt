package rotate_function_396

class Solution {
    fun maxRotateFunction(nums: IntArray): Int {

        // F(0) = (0 * a) + (1 * b) + (2 * c) + (3 * d) + (4 * e) = 0 + b + 2c + 3d + 4e
        // F(1) = (1 * a) + (2 * b) + (3 * c) + (4 * d) + (0 * e) = a + 2b + 3c + 4d + 0
        // F(2) = (2 * a) + (3 * b) + (4 * c) + (0 * d) + (1 * e) = 2a + 3b + 4c + 0 + e
        // F(3) = (3 * a) + (4 * b) + (0 * c) + (1 * d) + (2 * e) = 3a + 4b + 0 + d + 2e


        // F(1) - F(0) = a + b + c + d - 4e
        // F(1) - F(0) = a + b + c + d + e - 5e
        // F(1) - F(0) = SUM - 5e

        // F(2) - F(1) = a + b + c + e - 4d
        // F(2) - F(1) = a + b + c + d + e - 5d
        // F(2) - F(1) = SUM - 5d

        // F(3) - F(2) = SUM - 5c

        // F(K) - F(K-1) = SUM - N * (array [N - K])
        // F(K) = F(K-1) + SUM - N * (array [N - K])

        if (nums.isEmpty()) return 0

        var sum = 0
        var f0 = 0
        for (i in nums.withIndex()) {
            sum += i.value
            f0 += (i.index * i.value)
        }

        var max = Int.MIN_VALUE
        var dp: Array<Int> = Array(nums.size) { 0 }
        dp[0] = f0
        for (i in 1 until nums.size) {
            dp[i] = dp[i - 1] + sum - nums.size * (nums[nums.size - i])
            max = kotlin.math.max(max, dp[i])
        }

        return max
    }
}
/* Time Limit Exceeded
fun maxRotateFunction(nums: IntArray): Int {
    if (nums.size == 1) return 0

    // 어느 방향으로 돌려도 결과는 동일함
    var max = Int.MIN_VALUE
    for (i in 0 until nums.size) {
        max = kotlin.math.max(rotateN(nums, i), max)

    }

    return max
}

private fun rotateN(nums: IntArray, step: Int): Int {
    val mod = nums.size
    var sum = 0
    for (i in nums.withIndex()) {
        sum += nums[(i.index + step) % mod] * i.index
    }

    // println("sum -> $sum")
    return sum
}
*/

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.maxRotateFunction(intArrayOf(4, 3, 2, 6))
    println(result)
}