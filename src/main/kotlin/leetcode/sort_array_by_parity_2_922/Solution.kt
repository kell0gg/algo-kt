package leetcode.sort_array_by_parity_2_922

class Solution {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        val result: Array<Int> = Array(nums.size) { 0 }

        var oddIdx = 0
        var evenIdx = 0

        try {
            for (num in nums) {
                if (num % 2 == 0) {
                    result[2 * evenIdx] = num
                    evenIdx++
                } else {
                    result[(2 * oddIdx) + 1] = num
                    oddIdx++
                }
            }
        } catch (e: ArrayIndexOutOfBoundsException) {
            return intArrayOf()
        }
        return result.toIntArray()
    }
}

fun main() {
    val solution = Solution()
    val result = solution.sortArrayByParityII(intArrayOf(3, 2, 4, 5))
    for (i in result) {
        println(i)
    }
}