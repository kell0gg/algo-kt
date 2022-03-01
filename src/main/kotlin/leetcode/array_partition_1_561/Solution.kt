package leetcode.array_partition_1_561

class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        // 1. 어차피 배열의 총합은 정해져 있으므로, 두 개씩만 더하면 됨
        // 2. (1, 2), (3,4)
        // 3. (1+3)

        var sortedNum = nums.sortedArray()

        var sum = 0

        for (i in sortedNum.indices step 2) {
            sum += sortedNum[i]
        }

        return sum
    }
}