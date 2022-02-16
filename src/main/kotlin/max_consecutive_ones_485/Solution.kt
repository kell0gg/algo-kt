package max_consecutive_ones_485

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var sum = 0
        var max = 0
        for (i in nums) {
            if (i != 0) {
                sum++
            } else {
                max = kotlin.math.max(max, sum)
                sum = 0
            }
        }
        max = kotlin.math.max(max, sum)
        return max
    }
}

fun main(args: Array<String>) {
    val solution = Solution()
    solution.findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1))
}