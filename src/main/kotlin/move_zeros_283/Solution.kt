package move_zeros_283

class Solution {
    fun moveZeroes(nums: IntArray): Unit {

        var currentZero = 0
        for (i in nums.indices) {

            if (nums[i] != 0) {
                var tmp:Int = nums[currentZero]
                nums[currentZero] = nums[i]
                nums[i] = tmp
                currentZero++
            }
        }
    }
}