package leetcode.maximum_subarray_53

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        val dp = nums.clone()
        var max = nums[0]
        dp[0] = nums[0]

        for(i in 1 until nums.size){
            dp[i] =  kotlin.math.max(dp[i-1]+nums[i], nums[i])
            max = kotlin.math.max(dp[i], max)
        }
        return max
    }
}

fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(-1, 3, 5, 6)
    val solution = Solution()
    println(solution.maxSubArray(nums))
}