package leetcode.longest_continuous_increasing_subsequence_674

class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var max = 1
        var count = 1
        var before = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] > before) {
                count++
            } else {
                max = kotlin.math.max(max, count)
                count = 1
            }
            before = nums[i]
        }
        return max
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    val result = solution.findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7))
    println(result)
}