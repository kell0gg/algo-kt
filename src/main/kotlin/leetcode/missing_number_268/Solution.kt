package leetcode.missing_number_268

class Solution {
    fun missingNumber(nums: IntArray): Int {
        var sum = 0
        for (i in nums.indices) sum += nums[i] - i
        return nums.size - sum
    }
}

fun main(args: Array<String>) {
    // pass
}