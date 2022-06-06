package leetcode.monotonic_array_896

class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        return isMonotoneDecreasing(nums) || isMonotoneIncreasing(nums)
    }

    private fun isMonotoneDecreasing(nums: IntArray): Boolean {
        var before = nums[0]
        for (i in 1 until nums.size) {
            if (before > nums[i]) return false
            before = nums[i]
        }
        return true
    }

    private fun isMonotoneIncreasing(nums: IntArray): Boolean {
        var before = nums[0]
        for (i in 1 until nums.size) {
            if (before < nums[i]) return false
            before = nums[i]
        }
        return true
    }
}